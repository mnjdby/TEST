package com.fullerton.olp.service;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fullerton.olp.bean.AadhaarOtpKeyRequest;
import com.fullerton.olp.bean.AadhaarOtpKeyResponse;
import com.fullerton.olp.bean.AadhaarOtpRequest;
import com.fullerton.olp.bean.AadhaarOtpResponse;
import com.fullerton.olp.bean.OtpRequest;
import com.fullerton.olp.bean.PanRequest;
import com.fullerton.olp.bean.PanResponse;
import com.fullerton.olp.model.ApplicationStatus;
import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.model.UserDocument;
import com.fullerton.olp.repository.GenericDao;
import com.fullerton.olp.repository.UserDetailRepository;
import com.fullerton.olp.repository.support.DateRange;
import com.fullerton.olp.repository.support.SearchTemplate;
import com.fullerton.olp.settings.util.DateUtil;
import com.fullerton.olp.wsdao.aadhaar.AadhaarDAO;
import com.fullerton.olp.wsdao.bre.BreDAO;
import com.fullerton.olp.wsdao.bre.model.InvokeBREResponse;
import com.fullerton.olp.wsdao.cp.ConnectPlusDAO;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML;
import com.fullerton.olp.wsdao.crmnext.CrmNextDAO;
import com.fullerton.olp.wsdao.omnidocs.OmnidocsDAO;
import com.fullerton.olp.wsdao.otp.OtpDAO;
import com.fullerton.olp.wsdao.pan.PanDAO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserDetailServiceBean extends GenericEntityServiceImpl<UserDetail, Long> implements UserDetailService {

	private static final Logger log = LoggerFactory.getLogger(UserDetailServiceBean.class);


	@Value("${dupe.check.days.count}")
	private int DUPE_CHECK_DAYS;
    /**
     * The Spring Data repository for UserDetail entities.
     */
    @Autowired
    private UserDetailRepository userDetailRepository;

    @Autowired
    private ConnectPlusDAO connectPlusDAO;
    
    @Autowired
    private BreDAO breDAO;
    
    @Autowired
    private CrmNextDAO crmNextDAO;
   
    @Autowired
    private PanDAO panDAO;
    
    @Autowired
    private OtpDAO otpDAO;
    
    @Autowired
    private AadhaarDAO aadhaarDAO;

    @Autowired
    private WorkAddressService workAddressService;
    
    @Autowired
    private ProfessionalDetailService professionalDetailService;
    
    @Autowired
    private PersonalDetailService personalDetailService;

    @Autowired
    private UserDocumentService userDocumentService;
    
    @Autowired
    private DocumentService documentService;
    
    @Autowired
    private DocumentTypeService documentTypeService;
    
    
    @Autowired
    private  OmnidocsDAO omnidocsDAO;
    
    @Override
    public Boolean attemptedInThePast(UserDetail userDetail) {
	    	SearchTemplate searchTemplate = new SearchTemplate();
	    	DateRange<Date> createdDateCriteria = new DateRange<>("createdOn");
	    	Calendar calendar = Calendar.getInstance();
	    	calendar.add(Calendar.DATE, -DUPE_CHECK_DAYS);
	    	createdDateCriteria.setFrom(calendar.getTime());
	    	searchTemplate.add(createdDateCriteria);
	    	
	    	UserDetail example = new UserDetail();
	    	example.setEmail(userDetail.getEmail());
	    	example.setMobile(userDetail.getMobile());
	    	example.setIpAddress(userDetail.getIpAddress());
	    	example.setAadhaarVerified(null);
	    	example.setUserVerified(null);
	    	
    		return findCount(example, searchTemplate) > 0;
    }
    
    @Override
    public Boolean attemptedPanInThePast(UserDetail userDetail) {
    	
    		UserDetail userDetailDB = getById(userDetail.getId());
    	
	    	Calendar calendar = Calendar.getInstance();
	    	calendar.add(Calendar.DATE, -DUPE_CHECK_DAYS);
	    Long panCount = userDetailRepository.getPanCount(userDetailDB.getMobile(), userDetail.getProfessionalDetail().getPanNumber(), calendar.getTime());
	    	
    		return panCount > 0;
    }
    
	@Override
	@Transactional
	public Boolean saveFile(Long userDetailId, Long documentTypeId, Long documentId, MultipartFile file) {
		UserDetail userDetail = getById(userDetailId);
		
		try {
			userDocumentService.markInactive(userDetailId, documentId, documentTypeId);
			
			
			
			UserDocument userDocument = new UserDocument();
			userDocument.setActive(true);
			userDocument.setDocumentType(documentTypeService.getById(documentTypeId));
			userDocument.setDocument(documentService.getById(documentId));
			userDocument.setUserDetail(userDetail);
			String location = omnidocsDAO.upload(userDetail.getCpReferanceNumber()+"/"+documentId + "/" + file.getOriginalFilename(), file);
			userDocument.setFileLocation(location);
			userDocumentService.save(userDocument);
			
			super.save(userDetail);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
        
        return false;
	}
    
    @Override
    public UserDetail saveAadhaar(Long userDetailId, UserDetail entity) {
	    	UserDetail userDetail = findById(userDetailId);
	    	userDetail.setAadhaarNumber(entity.getAadhaarNumber());
	    	userDetail.setAadhaarVerified(false);
	    	userDetail.setAadhaarTxId("");
	    	
	    	save(userDetail);
	    	return userDetail;
    }
    
    @Override
    public UserDetail saveDetailData(UserDetail userDetail) {
    		UserDetail entity = findById(userDetail.getId());
    		entity.setApplicationStatus(new ApplicationStatus(1238l));//DDE CRM status
    		workAddressService.save(userDetail.getProfessionalDetail().getWorkAddress());
    		
    		professionalDetailService.save(userDetail.getProfessionalDetail());
    		
    		if(userDetail.getPersonalDetail() != null) {
    			personalDetailService.save(userDetail.getPersonalDetail());
    		}
    		
    		entity.setProfessionalDetail(userDetail.getProfessionalDetail());
    		entity.setPersonalDetail(userDetail.getPersonalDetail());
    		
	    	save(entity);
	    	
	    	if(StringUtils.isNotBlank(entity.getProfessionalDetail().getPanNumber())) {
    			
    			
    			Thread t = new Thread() {
    				public void run() {
    					try {
    						interactWithTPSystems(entity.getId());
    					} catch (Exception e) {
    						e.printStackTrace();
    					}
    				}
    			};
    			t.start();
    		}
	    	
	    	return entity;
    }
    
    public void interactWithTPSystems(Long userDetailId) throws IOException {
		UserDetail entity = findById(userDetailId);
		PanRequest panRequest = new PanRequest();
		panRequest.setValue(entity.getProfessionalDetail().getPanNumber());
		
		PanResponse panResponse = panDAO.verifyPAN(panRequest);
		if(panResponse.isResponseOK()) {
			entity.getProfessionalDetail().setPanVerified(true);
			
			createCPAccount(entity);

			//verify CIBIL
			FetchOutputNewApplicationXML fetchOutputNewApplicationXML = connectPlusDAO.fetchNewApplicationXML(entity.getCpReferanceNumber());
			//invoke BRE
			InvokeBREResponse invokeBREResponse = breDAO.invokeBRE(fetchOutputNewApplicationXML);
			String breStatus = extractStatus(invokeBREResponse.getInvokeBREReturn());
			entity.setBreStatus(breStatus);
			
			//TODO update status to user detail
			String leadKey = crmNextDAO.createLead(entity, invokeBREResponse);
			//TODO update lead id in user detail
			
			entity.setCrmLeadId(leadKey);
		}
	}
    
    private String extractStatus(String invokeBREResponse){
    	
    		int indexOfOutputVariables = invokeBREResponse.indexOf("<outputVariables>");
    		if(indexOfOutputVariables > 0) {
    			String statusBeginStr = invokeBREResponse.substring(indexOfOutputVariables);
    			int indexOfRiskStatus = statusBeginStr.indexOf("<riskStatus>");
    			if(indexOfRiskStatus > 0) {
    				return statusBeginStr.substring(indexOfRiskStatus + "<riskStatus>".length(), statusBeginStr.indexOf("</riskStatus>"));
    			}
    		}
    		
    	
    		return null;
    }
    
    @Override
    public Boolean verifyOtp(Long userDetailId, OtpRequest otp) {
    	 	UserDetail userDetail = findById(userDetailId);
    	 	
    	 	OtpRequest otpRequestToBeSent = createOtpRequest(userDetail);
    	 	otpRequestToBeSent.setOtp(otp.getOtp());
    	 	Boolean otpStatus = false;
    	 	try {
    	 			otpStatus = otpDAO.verifyOTP(otpRequestToBeSent).isResponseOK();
			} catch (Exception e) {
				log.error("Error while requesting OTP", e);
			}
    	 	
    	 	if(otpStatus) {
    	 		userDetail.setUserVerified(otpStatus);//update db with status
    	 		save(userDetail);
    	 	}
    	 	return otpStatus;
    	 	
    }

    public UserDetail createCPAccount(Long userDetailId) {
    		UserDetail userDetail = findById(userDetailId);
    		createCPAccount(userDetail);
		return userDetail;
	}
    
    public FetchOutputNewApplicationXML fetchNewApplicationXML(Long userDetailId) {
		UserDetail userDetail = findById(userDetailId);
		FetchOutputNewApplicationXML fetchOutputNewApplicationXML = connectPlusDAO.fetchNewApplicationXML(userDetail.getCpReferanceNumber());
		return fetchOutputNewApplicationXML;
    }

    
	private void createCPAccount(UserDetail userDetail) {
		try {
			String ticketNumber = connectPlusDAO.createNewAccount(userDetail);
			userDetail.setCpReferanceNumber(ticketNumber);
			save(userDetail);
		} catch (Exception e) {
			log.error("Error while requesting OTP", e);
		}
		
	}
    
    @Override
    public Boolean resendOtp(Long userDetailId) {
    	 	UserDetail userDetail = getById(userDetailId);
    		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					otpDAO.sendOTP(createOtpRequest(userDetail));
				} catch (Exception e) {
					log.error("Error while requesting OTP", e);
				}
			}
		};
		t.start();
    	 	return true;
    }
    
    @Override
    public Boolean generateAadharOtp(Long userDetailId) {
    	 	UserDetail userDetail = getById(userDetailId);
    		 
		try {
			AadhaarOtpResponse otpResponse = aadhaarDAO.sendOTP(createAadharOtpRequest(userDetail));
			userDetail.setAadhaarTxId(otpResponse.getTransactionId());
			save(userDetail);
			//if aadhaar otp set successfully, response we get is with error = false
			return ("false".equalsIgnoreCase(otpResponse.getError()));
			
		} catch (Exception e) {
			log.error("Error while requesting OTP", e);
		}
	  
    	 	return false;
    }
    
    @Override
    public Boolean verifyAadhaarOtp(Long userDetailId, AadhaarOtpKeyRequest otpRequestToBeSent) {
    	 	UserDetail userDetail = findById(userDetailId);
    	 	
    	 	updateAadharOtpKeyRequest(userDetail, otpRequestToBeSent);
    	 	
    	 	Boolean otpStatus = false;
		try {
			AadhaarOtpKeyResponse aadhaarOtpKeyResponse = aadhaarDAO.verifyOTP(otpRequestToBeSent);
			otpStatus = "false".equalsIgnoreCase(aadhaarOtpKeyResponse.getError());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
    	 	userDetail.setAadhaarVerified(otpStatus);
    	 	
    	 	return otpStatus;
    }
    
    
    public void save(UserDetail userDetail) {
    		workAddressService.save(userDetail.getProfessionalDetail().getWorkAddress());
    		
    		professionalDetailService.save(userDetail.getProfessionalDetail());
    		
    		if(userDetail.getPersonalDetail() != null) {
    			personalDetailService.save(userDetail.getPersonalDetail());
    		}
    		super.save(userDetail);
    }
    
    private OtpRequest createOtpRequest(UserDetail userDetail) {
	    	OtpRequest otpRequest = new OtpRequest();
	    	
	    	otpRequest.setMobileNumber(userDetail.getMobile());
	    	otpRequest.setEmailId(userDetail.getEmail());
	    	otpRequest.setUniqueRefernceNumber(userDetail.getId() + DateUtil.getDateString(userDetail.getCreatedOn()));
	    	otpRequest.setUserId("OLP"+userDetail.getId());
	    	otpRequest.setDeviceCreatedOn(""+new Date().getTime());

    		return otpRequest;
    }
    
    private AadhaarOtpRequest createAadharOtpRequest(UserDetail userDetail) {
    		AadhaarOtpRequest otpRequest = new AadhaarOtpRequest();
    		otpRequest.setUid(userDetail.getAadhaarNumber());
		return otpRequest;
    }
    
    private AadhaarOtpKeyRequest updateAadharOtpKeyRequest(UserDetail userDetail, final AadhaarOtpKeyRequest otpKeyRequest) {
	    	otpKeyRequest.setOtpTxn(userDetail.getAadhaarTxId());
	    	otpKeyRequest.setUid(userDetail.getAadhaarNumber());
		
		return otpKeyRequest;
    }
    /**
     * Find and return all userDetails
     * @return collection of all userDetails
     */
    @Override
    public Collection<UserDetail> findAll() {
        Collection<UserDetail> userDetails = userDetailRepository.find(new UserDetail(), new SearchTemplate());
        return userDetails;
    }

    @Override
    public UserDetail findById(Long id) {
		UserDetail userDetail = userDetailRepository.findOne(id);
        return userDetail;
    }
	
	@Override
	public GenericDao<UserDetail, Long> getDao() {
		// TODO Auto-generated method stub
		return userDetailRepository;
	}

	@Override
	public UserDetail getNew() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetail getNewWithDefaults() {
		// TODO Auto-generated method stub
		return null;
	}
}