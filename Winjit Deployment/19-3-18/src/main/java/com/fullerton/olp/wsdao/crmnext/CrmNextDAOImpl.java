package com.fullerton.olp.wsdao.crmnext;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.settings.util.DateUtil;
import com.fullerton.olp.wsdao.crmnext.model.ArrayOfCRMnextObject;
import com.fullerton.olp.wsdao.crmnext.model.ArrayOfSaveResult;
import com.fullerton.olp.wsdao.crmnext.model.CRMnextObject;
import com.fullerton.olp.wsdao.crmnext.model.CRMnextObjectKey;
import com.fullerton.olp.wsdao.crmnext.model.CRMnextObjectType;
import com.fullerton.olp.wsdao.crmnext.model.Fetch;
import com.fullerton.olp.wsdao.crmnext.model.FetchResponse;
import com.fullerton.olp.wsdao.crmnext.model.Lead;
import com.fullerton.olp.wsdao.crmnext.model.LeadCustomFields;
import com.fullerton.olp.wsdao.crmnext.model.ObjectFactory;
import com.fullerton.olp.wsdao.crmnext.model.Save;
import com.fullerton.olp.wsdao.crmnext.model.SaveResponse;
import com.fullerton.olp.wsdao.crmnext.model.UserContext;


/**
 * Sample client to invoice WS
 * 
 * @author nitish
 *
 */
public class CrmNextDAOImpl extends WebServiceGatewaySupport implements CrmNextDAO{

	private static final Logger log = LoggerFactory.getLogger(CrmNextDAO.class);

	@Value("${crm-ws.token}")
	private String token = "qjg8clqv8mjs5njd6l2s676fk7uplvkfh4grbugc7gsfkj3eujzl5sjxyzz9u67bel3kdzdbvqaces9qkwst4ud6qktbk8lxk9lsghsu3duc6l4dwq39lh6x2x3qe729gh433ymdpajs93hpwzdpq8dmbmhmdnqyzyg4v6d5d9w4kmcug5zms3es8uavzwrgyguybajv7tgelytyjec884csa3bjsydc7kbqpgf73pk3cc6u6k4l94qbxjl6cm9qh2f8ab4uwwuc348ztqv6fwuhykhe2seq4hckadv333sc263tbqncgsh8ymmeq8m7evnw6gr3ndngzsemwvtlnaltg47j4jwbtj6zfah86erb8x3x5xup35buymb6y6mz6vdl6l4378lreaete9cw7j5k44bpb3tej8r8a39gs8abd2wrl4tph86acdgl879znugl35afvjmetlstfth4hlpal3nnb3ltfqzkcwbmdhf5dvck2sxax8qus2d9w8ryucqlcb458jjrtmrpll7cvprwrxjgmvdc9cygnacalxf7fqrnnypzb5p8xc5ftkte2dyv5q52sk8gbmawt9sdgr7z55789c4cwn5x5f2";
	
	public String createLead(UserDetail userDetail) {
		Lead leadRequest = new ObjectFactory().createLead();
        
		//saveRequest.setUserContext(value);
		//log.info("Creating new account with request: " + request);

		SaveResponse response =  (SaveResponse)getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						leadRequest,
						new SoapActionCallback("Save"));
		JAXBElement<ArrayOfSaveResult> saveResult = response.getSaveResult();
		System.out.println(saveResult.getValue());
		/*FetchOutputNewApplicationXML response =  (FetchOutputNewApplicationXML) getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						root,
						new SoapActionCallback("fetchNewApplicationXML"));*/

		
		/*<wsdl:operation name="Save">
		  <wsdl:input wsaw:Action="http://www.crmnext.com/api/ICRMnextApi/Save" message="tns:ICRMnextApi_Save_InputMessage" /> 
		  <wsdl:output wsaw:Action="http://www.crmnext.com/api/ICRMnextApi/SaveResponse" message="tns:ICRMnextApi_Save_OutputMessage" /> 
		  </wsdl:operation>*/
		return null;
		
		
	}
	
	public FetchResponse leadFetch(UserDetail userDetail) {
		Fetch fetchRequest = new ObjectFactory().createFetch();
		JAXBElement<UserContext> userContext = fetchRequest.getUserContext();
		setUserContext(userContext);
		userContext.getValue().getLongDateFormat().setValue("");
		userContext.getValue().getLongDateTimeFormat().setValue("");
		
		fetchRequest.setObjectType(CRMnextObjectType.LEAD);
		
		CRMnextObjectKey crmNextObjectKey = new ObjectFactory().createCRMnextObjectKey();
		crmNextObjectKey.getItemKey().setValue(userDetail.getCrmLeadId());//TODO check this
		
		fetchRequest.getObjectids().getValue().getCRMnextObjectKeies().add(crmNextObjectKey); 
		
		
		FetchResponse response =  (FetchResponse)getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						fetchRequest,
						new SoapActionCallback("Fetch"));
		System.out.println(response);
		
//		<api:Fetch>
//        <!--Optional:-->
//        <api:userContext>
//           <!--Optional:-->
//           <api:IsSuccess>true</api:IsSuccess>
//           <!--Optional:-->
//           <api:Message></api:Message>
//           <!--Optional:-->
//           <api:ClientTimeOffSet>0</api:ClientTimeOffSet>
//           <!--Optional:-->
//           <api:ExpiresOn>2027-04-07T04:12:19.3497212+05:30</api:ExpiresOn>
//           <!--Optional:-->
//           <api:IsUTC>false</api:IsUTC>
//           <!--Optional:-->
//           <api:LongDateFormat></api:LongDateFormat>
//           <!--Optional:-->
//           <api:LongDateTimeFormat></api:LongDateTimeFormat>
//           <!--Optional:-->
//           <!--<api:Token>qjg8clqv8mjs5njd6l2s676fkp4v9ls33x27s4zcvb25y9d965nnzlwr5cnbvf84henvdscnvmfxkdfrwap5e2k3nmrtn8dneu5pcy676hymgmjxfbtfclysd7thqhcf4zll7fmdgqgnlcer6hz748hktsegtybt8jcns5gbrjerphg4gqvfr35l338rdp9f6u8w48cq6c8psbsse4xpt6ph7jkvld4dplaqek2c5a6da6vbkstexu4gjgy7ya5mz7nz2znt7fbcr7prcmlgqhharve53r8w2f4jyg2nnr597mhfr4q3a2pb8twt6fyb</api:Token>-->
//           <api:Token>qjg8clqv8mjs5njd6l2s676fk7uplvkfh4grbugc7gsfkj3eujzl5sjxyzz9u67bel3kdzdbvqaces9qkwst4ud6qktbk8lxk9lsghsu3duc6l4dwq39lh6x2x3qe729gh433ymdpajs93hpwzdpq8dmbmhmdnqyzyg4v6d5d9w4kmcug5zms3es8uavzwrgyguybajv7tgelytyjec884csa3bjsydc7kbqpgf73pk3cc6u6k4l94qbxjl6cm9qh2f8ab4uwwuc348ztqv6fwuhykhe2seq4hckadv333sc263tbqncgsh8ymmeq8m7evnw6gr3ndngzsemwvtlnaltg47j4jwbtj6zfah86erb8x3x5xup35buymb6y6mz6vdl6l4378lreaete9cw7j5k44bpb3tej8r8a39gs8abd2wrl4tph86acdgl879znugl35afvjmetlstfth4hlpal3nnb3ltfqzkcwbmdhf5dvck2sxax8qus2d9w8ryucqlcb458jjrtmrpll7cvprwrxjgmvdc9cygnacalxf7fqrnnypzb5p8xc5ftkte2dyv5q52sk8gbmawt9sdgr7z55789c4cwn5x5f2</api:Token>
//        </api:userContext>
//        <!--Optional:-->
//        <api:objectType>Lead</api:objectType>
//        <!--Optional:-->
//        <api:objectids>
//           <!--Zero or more repetitions:-->
//           <api:CRMnextObjectKey>
//              <!--Optional:-->
//              <api:ItemKey>1528924</api:ItemKey>
//           </api:CRMnextObjectKey>
//        </api:objectids>
//     </api:Fetch>
     return response;
	}

	private void setUserContext(JAXBElement<UserContext> userContext) {
		
		userContext.getValue().setToken(new ObjectFactory().createUserContextToken(token));
		userContext.getValue().setIsSuccess(true);
		userContext.getValue().setMessage(new ObjectFactory().createResultMessage(""));
		userContext.getValue().setClientTimeOffSet(0d);
		Calendar calendar = Calendar.getInstance();
		calendar.set(2027, 03, 07, 04, 12, 19);  
//		"2027-04-07T04:12:19.3497212+05:30"
		userContext.getValue().setExpiresOn(calendar);
		userContext.getValue().setIsUTC(true);
	}
	
	public String createSave(UserDetail userDetail  ) {
		Save saveRequest = new ObjectFactory().createSave();
		saveRequest.setUserContext(new ObjectFactory().createUserContext(new ObjectFactory().createUserContext()));
		JAXBElement<UserContext> userContext = saveRequest.getUserContext();
		setUserContext(userContext);
		
		ArrayOfCRMnextObject arrayOfCRMnextObject = new ObjectFactory().createArrayOfCRMnextObject();
		arrayOfCRMnextObject.getCRMnextObjects().add(createLeadObject(userDetail));
		JAXBElement<ArrayOfCRMnextObject> arrayOfCRMnextObjectElement = new ObjectFactory().createArrayOfCRMnextObject( arrayOfCRMnextObject);
		
		saveRequest.setObjects(arrayOfCRMnextObjectElement);
		
		saveRequest.setReturnObjectOnSave(false);
		
		SaveResponse response =  (SaveResponse)getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						saveRequest,
						new SoapActionCallback("Save"));
		JAXBElement<ArrayOfSaveResult> saveResult = response.getSaveResult();
		System.out.println(saveResult.getValue());
		/*FetchOutputNewApplicationXML response =  (FetchOutputNewApplicationXML) getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						root,
						new SoapActionCallback("fetchNewApplicationXML"));*/

		
		/*<wsdl:operation name="Save">
		  <wsdl:input wsaw:Action="http://www.crmnext.com/api/ICRMnextApi/Save" message="tns:ICRMnextApi_Save_InputMessage" /> 
		  <wsdl:output wsaw:Action="http://www.crmnext.com/api/ICRMnextApi/SaveResponse" message="tns:ICRMnextApi_Save_OutputMessage" /> 
		  </wsdl:operation>*/
		return null;
	}
	
	private CRMnextObject createLeadObject(UserDetail userDetail) {
		Lead crmNextObject = new ObjectFactory().createLead();
		
		crmNextObject.setEmailOptOut(false);//default
		crmNextObject.setPhoneOptOut(false);//default
		crmNextObject.setSmsOptOut(false);//default
		QName qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "PreferredChannel");
	    JAXBElement<String> channel = new JAXBElement<>(qName, String.class, "Email");
		crmNextObject.setPreferredChannel(channel);//default -TBC
		
		
//        <api:TerritoryName/>
//        <api:AccountID>-1</api:AccountID>
//        <api:AccountKey/>
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "Address");
	    JAXBElement<String> address = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getWorkAddress().getAddress1());
		crmNextObject.setAddress(address);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "City");
	    JAXBElement<String> city = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getWorkAddress().getCity().getName());
		crmNextObject.setCity(city);

		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "CampaignKey");
	    JAXBElement<String> campaignKey = new JAXBElement<>(qName, String.class, "35");
		crmNextObject.setCampaignKey(campaignKey);
		
		crmNextObject.setChildAccountID(-1);
		
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "CompanyName");
	    JAXBElement<String> companyName = new JAXBElement<>(qName, String.class, "Others");
		crmNextObject.setCompanyName(companyName);
		
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "Country");
	    JAXBElement<String> country = new JAXBElement<>(qName, String.class, "India");
		crmNextObject.setCountry(country);
		
		crmNextObject.setCreatedBy(1);//default
		
		crmNextObject.setCreatedOn(Calendar.getInstance());//current time stamp
		
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "CurrencyID");
	    JAXBElement<String> currencyId = new JAXBElement<>(qName, String.class, "INR");
		crmNextObject.setCurrencyID(currencyId);
		
		JAXBElement<LeadCustomFields> customFieldsElement = new ObjectFactory().createLeadCustom(createCustom(userDetail));
		crmNextObject.setCustom(customFieldsElement);
 
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "LastName");
	    JAXBElement<String> lastName = new JAXBElement<>(qName, String.class, userDetail.getName().split(" ").length > 1? userDetail.getName().split(" ")[1]:"");
		crmNextObject.setLastName(lastName);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "FirstName");
	    JAXBElement<String> FirstName = new JAXBElement<>(qName, String.class, userDetail.getName().split(" ")[0]);
		crmNextObject.setLastName(FirstName);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "LeadName");
	    JAXBElement<String> LeadName = new JAXBElement<>(qName, String.class, userDetail.getName());
		crmNextObject.setLastName(LeadName);

		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "MobilePhone");
	    JAXBElement<String> MobilePhone = new JAXBElement<>(qName, String.class, userDetail.getMobile());
		crmNextObject.setMobilePhone(MobilePhone);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "OfficePhone");
	    JAXBElement<String> OfficePhone = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getWorkAddress().getLandline()==null?"":userDetail.getProfessionalDetail().getWorkAddress().getLandline());
		crmNextObject.setOfficePhone(OfficePhone);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "SalutationName");
	    JAXBElement<String> SalutationName = new JAXBElement<>(qName, String.class, userDetail.getPersonalDetail().getGender().getName().equalsIgnoreCase("male")?"Mr":"Mrs");
		crmNextObject.setSalutationName(SalutationName);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "ZipCode");
	    JAXBElement<String> ZipCode = new JAXBElement<>(qName, String.class, userDetail.getPersonalDetail().getResidenceAddress().getPincode().getName());
		crmNextObject.setZipCode(ZipCode);
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "Email");
	    JAXBElement<String> Email = new JAXBElement<>(qName, String.class, userDetail.getEmail());
		crmNextObject.setEmail(Email);
		
//        <!--api:EmployeeCountKey>0</api:EmployeeCountKey-->
//        <api:ExternalSLAOn>0001-01-01T00:00:00</api:ExternalSLAOn>

//        <!--api:IndustryKey>0</api:IndustryKey-->
//        <api:InternalSLA>0</api:InternalSLA>
//        <api:InternalSLAOn>0001-01-01T00:00:00</api:InternalSLAOn>
//        <api:IsAssignmentRule>false</api:IsAssignmentRule>
//        <api:IsAutoResponse>false</api:IsAutoResponse>
//        <api:IsChildLead>false</api:IsChildLead>
//        <api:IsDedupeSearch>false</api:IsDedupeSearch>
//        <api:IsInsideBHR>false</api:IsInsideBHR>
//        <api:LastModifiedBy>0</api:LastModifiedBy>
//        <api:LastModifiedOn>0001-01-01T00:00:00</api:LastModifiedOn>
//        
//        <api:LastPrintedBy>0</api:LastPrintedBy>
//        <api:LastPrintedByName/>
//        <api:LastPrintedOn>0001-01-01T00:00:00</api:LastPrintedOn>
//        <api:LayoutKey>2061</api:LayoutKey>
//        <api:l_Professional_Status1>1</api:l_Professional_Status1>
//        <api:LeadAmount>0</api:LeadAmount>
//        <api:LeadAmountDefault>0</api:LeadAmountDefault>

//        <api:LeadOwnerKey>1</api:LeadOwnerKey>
//        <api:LeadOwnerTypeID>0</api:LeadOwnerTypeID>
//        <api:LeadParentId>0</api:LeadParentId>
//        <api:LeadRating>Warm</api:LeadRating>
//        <api:LeadSourceKey>0</api:LeadSourceKey>
//        <api:MiddleName>BHIMRAO</api:MiddleName>

//        <api:ObjectUniqueId/>
//        <api:OfferID>0</api:OfferID>

//        <api:PreferredChannelKey>1</api:PreferredChannelKey>
//        <api:PrevAssignTo>0</api:PrevAssignTo>
//        <api:PrevOwnerId>0</api:PrevOwnerId>
//        <api:PreviousStageId>0</api:PreviousStageId>
//        <api:PrintStatus>false</api:PrintStatus>
//        <api:ProductCategory>Unsecured</api:ProductCategory>
//        <api:ProductCategoryID>0</api:ProductCategoryID>
//        <api:ProductCode>PL</api:ProductCode>
//        <api:ProductKey>14</api:ProductKey>
//        <api:QualifiedOn>0001-01-01T00:00:00</api:QualifiedOn>
//        <api:RatingKey>2</api:RatingKey>
//        <api:SalutationKey>4</api:SalutationKey>

//        <api:StageID>0</api:StageID>
//        <api:StageName>Active</api:StageName>
//        <api:StatusCodeDisplayText>New Lead</api:StatusCodeDisplayText>
//        <api:StatusCodeInOn>0001-01-01T00:00:00</api:StatusCodeInOn>
//        <api:StatusCodeKey>132</api:StatusCodeKey>
//        <api:StatusCodeName>Application Rejected</api:StatusCodeName>
//        <api:TeamID>0</api:TeamID>
//        <api:TerritoryCode>1213</api:TerritoryCode>
//        <api:TerritoryKey>1454</api:TerritoryKey>

//     </api:CRMnextObject>
		
		return crmNextObject;
	}

	private LeadCustomFields createCustom(UserDetail userDetail) {
		LeadCustomFields customFields = new ObjectFactory().createLeadCustomFields();
		
		
		QName qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Tier");
	    JAXBElement<String> tier = new JAXBElement<>(qName, String.class, userDetail.getCity().getTier().getName());
		customFields.setLTier(tier);
		
		
		qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_AIP_Amount");
	    JAXBElement<BigDecimal> aipAmount = new JAXBElement<>(qName, BigDecimal.class, BigDecimal.valueOf(userDetail.getLoanAmount()));
	    customFields.setLAIPAmount(aipAmount);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_AIP_Tenure");
	    JAXBElement<Integer> aipTenure = new JAXBElement<>(qName, Integer.class, userDetail.getTenure());
	    customFields.setLAIPTenure(aipTenure);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Applicant_Type");
	    JAXBElement<String> applicantType = new JAXBElement<>(qName, String.class, "1");
	    customFields.setLApplicantType(applicantType);
		
		
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_DOB");
	    JAXBElement<String> dob = new JAXBElement<>(qName, String.class, DateUtil.getDateCRMString(userDetail.getPersonalDetail().getDob()));//30/06/83
	    customFields.setLDOB(dob);
		
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_PAN");
	    JAXBElement<String> pan = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getPanNumber());
	    customFields.setLPAN(pan);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Gross_Monthly_Income");
	    JAXBElement<BigDecimal> monthlyIncome = new JAXBElement<>(qName, BigDecimal.class, BigDecimal.valueOf(userDetail.getProfessionalDetail().getMonthlyIncome()));
	    customFields.setLGrossMonthlyIncome(monthlyIncome);
		
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Gender");
	    JAXBElement<String> gender = new JAXBElement<>(qName, String.class, userDetail.getPersonalDetail().getGender().getName().equalsIgnoreCase("male")?"M":"F");
	    customFields.setLGender(gender);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_MaritalStatus");
	    JAXBElement<String> maritalStatus = new JAXBElement<>(qName, String.class, userDetail.getPersonalDetail().getMarritalStatus().getId().toString());
	    customFields.setLGender(maritalStatus);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "api:FieldID_67");
	    JAXBElement<String> field67 = new JAXBElement<>(qName, String.class, "WHITE FIELD");
	    customFields.setFieldID67(field67);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Current_Country");
	    JAXBElement<String> country = new JAXBElement<>(qName, String.class, userDetail.getCity().getState().getTerritory().getName());
	    customFields.setLCurrentCountry(country);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Yrs_Current_Add");
	    JAXBElement<Integer> yrsCurrentAdd = new JAXBElement<>(qName, Integer.class,DateUtil.getDiffYears(userDetail.getPersonalDetail().getResidenceAddress().getLivingSince()));
	    customFields.setLYrsCurrentAdd(yrsCurrentAdd);
	    
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Type_Current_Res");
	    JAXBElement<String> typeCurrentRes = new JAXBElement<>(qName, String.class, "REN");
	    customFields.setLTypeCurrentRes(typeCurrentRes);
	    
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Monthly_Repayment");
	    JAXBElement<BigDecimal> monthlyRepayment = new JAXBElement<>(qName, BigDecimal.class, BigDecimal.ZERO);
	    customFields.setLMonthlyRepayment(monthlyRepayment);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Office_Address1");
	    JAXBElement<String> officeAddress1 = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getWorkAddress().getAddress1());
	    customFields.setLOfficeAddress1(officeAddress1);
	    
		
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Office_Address2");
	    JAXBElement<String> officeAddress2 = new JAXBElement<>(qName, String.class,  userDetail.getProfessionalDetail().getWorkAddress().getAddress2());
	    customFields.setLOfficeAddress2(officeAddress2);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Office_Country");
	    JAXBElement<String> oCountry = new JAXBElement<>(qName, String.class,  userDetail.getProfessionalDetail().getWorkAddress().getCity().getState().getTerritory().getName());
	    customFields.setLOfficeCountry(oCountry);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Res_Mobile_No");
	    JAXBElement<String> rMobile = new JAXBElement<>(qName, String.class,  userDetail.getMobile());
	    customFields.setLResMobileNo(rMobile);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_CIBIL_Score");
	    JAXBElement<Integer> cibilScore = new JAXBElement<>(qName, Integer.class,  0);
	    customFields.setLCIBILScore(cibilScore);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_OrganizationType");
	    JAXBElement<String> l_OrganizationType = new JAXBElement<>(qName, String.class,  "5");
	    customFields.setLOrganizationType(l_OrganizationType);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Net_Monthly_Income");
	    JAXBElement<BigDecimal> l_Net_Monthly_Income = new JAXBElement<>(qName, BigDecimal.class, BigDecimal.valueOf(userDetail.getProfessionalDetail().getMonthlyIncome()));
	    customFields.setLNetMonthlyIncome(l_Net_Monthly_Income);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Customertype");
	    JAXBElement<String> l_Customertype = new JAXBElement<>(qName, String.class, "14");
	    customFields.setLCustomertype(l_Customertype);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Qualification");
	    JAXBElement<String> l_Qualification = new JAXBElement<>(qName, String.class, userDetail.getQualification().getId().toString());
	    customFields.setLQualification(l_Qualification);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_RequiredLoanAmt");
	    JAXBElement<BigDecimal> l_RequiredLoanAmt = new JAXBElement<>(qName, BigDecimal.class, BigDecimal.valueOf(userDetail.getLoanAmount()));
	    customFields.setLRequiredLoanAmt(l_RequiredLoanAmt);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Branch_Disposition");
	    JAXBElement<String> l_Branch_Disposition = new JAXBElement<>(qName, String.class, "Interested");
	    customFields.setLBranchDisposition(l_Branch_Disposition);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Emp_Type");
	    JAXBElement<String> l_Emp_Type = new JAXBElement<>(qName, String.class, "K");
	    customFields.setLEmpType(l_Emp_Type);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Total_Work_Exp_Yrs");
	    JAXBElement<Integer> l_Total_Work_Exp_Yrs = new JAXBElement<>(qName, Integer.class, 2);
	    customFields.setLTotalWorkExpYrs(l_Total_Work_Exp_Yrs);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Company_Type_Salaried");
	    JAXBElement<String> l_Company_Type_Salaried = new JAXBElement<>(qName, String.class, "OTHERS");
	    customFields.setLCompanyTypeSalaried(l_Company_Type_Salaried);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Company_Name_salaried");
	    JAXBElement<String> l_Company_Name_salaried = new JAXBElement<>(qName, String.class, "OTHERS");
	    customFields.setLCompanyNameSalaried(l_Company_Name_salaried);

	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Lead_Source");
	    JAXBElement<String> l_Lead_Source = new JAXBElement<>(qName, String.class, "Online Portal");
	    customFields.setLLeadSource(l_Lead_Source);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Lead_Sub_source");
	    JAXBElement<String> l_Lead_Sub_source = new JAXBElement<>(qName, String.class, "Mass Channels");
	    customFields.setLLeadSubSource(l_Lead_Sub_source);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Office_STD_Code");
	    JAXBElement<String> l_Office_STD_Code = new JAXBElement<>(qName, String.class, "0123");
	    customFields.setLOfficeSTDCode(l_Office_STD_Code);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_City_productwise");
	    JAXBElement<String> l_City_productwise = new JAXBElement<>(qName, String.class, "Bangalore");
	    customFields.setLCityProductwise(l_City_productwise);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_CopyProduct");
	    JAXBElement<String> l_CopyProduct = new JAXBElement<>(qName, String.class, "PL");
	    customFields.setLCopyProduct(l_CopyProduct);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Lead_Status_Summary");
	    JAXBElement<String> l_Lead_Status_Summary = new JAXBElement<>(qName, String.class, "1");
	    customFields.setLLeadStatusSummary(l_Lead_Status_Summary);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Type");
	    JAXBElement<String> l_Type = new JAXBElement<>(qName, String.class, "1");
	    customFields.setLType(l_Type);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "FieldID_986");
	    JAXBElement<Integer> FieldID_986 = new JAXBElement<>(qName, Integer.class, 0);
	    customFields.setFieldID986(FieldID_986);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Currentpincode");
	    JAXBElement<String> l_Currentpincode = new JAXBElement<>(qName, String.class, userDetail.getPersonalDetail().getResidenceAddress().getPincode().getName());
	    customFields.setLCurrentpincode(l_Currentpincode);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_OfficePincode");
	    JAXBElement<String> l_OfficePincode = new JAXBElement<>(qName, String.class, userDetail.getProfessionalDetail().getWorkAddress().getPincode().getName());
	    customFields.setLOfficePincode(l_OfficePincode);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "FieldID_1042");
	    JAXBElement<Integer> FieldID_1042 = new JAXBElement<>(qName, Integer.class, 0);
	    customFields.setFieldID1042(FieldID_1042);
	    
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "l_Report_EmpType");
	    JAXBElement<String> l_Report_EmpType = new JAXBElement<>(qName, String.class, "1");
	    customFields.setLReportEmpType(l_Report_EmpType);
	     
	    qName = new QName("com.fullerton.olp.wsdao.crmnext.model", "FieldID_1070");
	    JAXBElement<String> FieldID_1070 = new JAXBElement<>(qName, String.class, "Tetra Media Pvt Ltd (Rupee Power)_MA039");
	    customFields.setFieldID1070(FieldID_1070);
	    
 
//      <I_Spouse_Income>0</I_Spouse_Income>
//      <FieldID_1463>0</FieldID_1463>
//      <FieldID_1464>0</FieldID_1464>
//      <l_Lead_Created_On>13/07/17 05:34 PM</l_Lead_Created_On>
//      <FieldID_1989>1</FieldID_1989>
//      <l_Doc_Chk_ApplicationForm1>55</l_Doc_Chk_ApplicationForm1>
//      <l_DocChk_ApplicationForm_Status1>2</l_DocChk_ApplicationForm_Status1>
//      <l_ApplicationForm_Doc_Upload1>195738</l_ApplicationForm_Doc_Upload1>
//      <l_Professional_Status1>1</l_Professional_Status1>
//      <l_Lead_Status_Summary>1</l_Lead_Status_Summary>
//      <l_noOfIrdBncPayPF>0</l_noOfIrdBncPayPF>
//      <l_noOfSalPenCrePF>0</l_noOfSalPenCrePF>
//      <l_totlNumrOfTranPF>0</l_totlNumrOfTranPF>
//      <l_durOfDataFetchPF>0</l_durOfDataFetchPF>
//      <l_lstOfAllTranPF>0</l_lstOfAllTranPF>
//      <l_creditTurnoverPF>0</l_creditTurnoverPF>
//      <l_highestBalancePF>0</l_highestBalancePF>
//      <FieldID_848>0</FieldID_848>
//      <api:FieldID_849>0</api:FieldID_849>
//      <api:FieldID_850>0</api:FieldID_850>
//      <api:FieldID_851>0</api:FieldID_851>
//      <api:FieldID_852>0</api:FieldID_852>
//      <api:FieldID_853>0</api:FieldID_853>
//      <api:FieldID_854>0</api:FieldID_854>
//      <api:FieldID_855>0</api:FieldID_855>
//      <api:FieldID_856>0</api:FieldID_856>
//      <api:FieldID_857>0</api:FieldID_857>
//      <api:l_accountNumberPF>0</api:l_accountNumberPF>
//      <api:FieldID_859>N</api:FieldID_859>
//      <api:l_avgIncomePF>0</api:l_avgIncomePF>
//      <api:FieldID_986>0</api:FieldID_986>
//      <api:FieldID_1042>0</api:FieldID_1042>
//      <api:I_Additional_Income/>
//      <api:I_Spouse_Income>0</api:I_Spouse_Income>
//      <api:l_Lead_Created_On>13/07/17 05:34 PM</api:l_Lead_Created_On>
//      <api:l_trade_info_1>0</api:l_trade_info_1>
//      <api:l_trade_info_2>0</api:l_trade_info_2>
//      <api:l_trade_info_3>0</api:l_trade_info_3>
//      <api:l_trade_info_5>0</api:l_trade_info_5>
//      <api:l_trade_info_6>0</api:l_trade_info_6>
//      <api:l_trade_info_7>0</api:l_trade_info_7>
//      <api:l_trade_info_8>0</api:l_trade_info_8>
//      <api:l_enq_info_1>0</api:l_enq_info_1>
//      <api:l_enq_info_2>0</api:l_enq_info_2>
//      <api:l_enq_info_3>0</api:l_enq_info_3>
//      <api:l_enq_info_4>0</api:l_enq_info_4>
//      <api:l_enq_info_5>0</api:l_enq_info_5>
//      <api:l_enq_info_6>0</api:l_enq_info_6>
//      <api:l_enq_info_7>0</api:l_enq_info_7>
//      <api:l_cust_info_1>45454</api:l_cust_info_1>
//      <api:l_trade_info_10>4</api:l_trade_info_10>
//      <api:l_trade_info_11>4740</api:l_trade_info_11>
//      <api:l_trade_info_12>0</api:l_trade_info_12>
//      <api:l_pt_var_1>0</api:l_pt_var_1>
//      <api:l_pt_var_2>0</api:l_pt_var_2>
//      <api:l_pt_var_3>0</api:l_pt_var_3>
//      <api:l_pt_var_4>0</api:l_pt_var_4>
//      <api:l_pt_var_5>0</api:l_pt_var_5>
//      <api:l_pt_var_6>0</api:l_pt_var_6>
//      <api:l_pt_var_7>0</api:l_pt_var_7>
//      <api:l_pt_var_8>0</api:l_pt_var_8>
//      <api:l_pt_var_9>0</api:l_pt_var_9>
//      <api:l_pt_var_10>0</api:l_pt_var_10>
//      <api:l_pt_var_11>0</api:l_pt_var_11>
//      <api:l_pt_var_12>0</api:l_pt_var_12>
//      <api:l_pt_var_13>0</api:l_pt_var_13>
//      <api:l_pt_var_14>0</api:l_pt_var_14>
//      <api:l_pt_var_15>0</api:l_pt_var_15>
//      <api:l_pt_var_16>0</api:l_pt_var_16>
//      <api:l_pt_var_17>0</api:l_pt_var_17>
//      <api:l_pt_var_18>0</api:l_pt_var_18>
//      <api:l_pt_var_19>0</api:l_pt_var_19>
//      <api:l_pt_var_20>0</api:l_pt_var_20>
//      <api:l_pt_var_21>0</api:l_pt_var_21>
//      <api:l_pt_var_22>0</api:l_pt_var_22>
//      <api:l_trade_info_4>0.0</api:l_trade_info_4>
//      <api:l_trade_info_9>0.0</api:l_trade_info_9>
//      <api:l_RiskStatus/>
//      <api:l_RiskGrade>GRADEF</api:l_RiskGrade>
//      <api:l_RpPowerRiskStatus>R</api:l_RpPowerRiskStatus>
//      <api:l_RPCIBIL_Score>00608</api:l_RPCIBIL_Score>
//      <api:l_RPConnectToken>3390986</api:l_RPConnectToken>
//      <api:l_CIBILID>001637762159</api:l_CIBILID>
//      <api:l_Emp_Type>K</api:l_Emp_Type>
//      <api:l_Bank_Name2>LS|LS_Email|None||||p_165</api:l_Bank_Name2>
//      <api:l_Salary_Credit_Mode>1</api:l_Salary_Credit_Mode>
//      <api:l_Office_Landline_No>3200040</api:l_Office_Landline_No>
//      <api:l_EmployerName>KOTAK MAHINDRA OLD MUTUAL LIFE INS LTD  BRAND IS KOTAK LIFE INSURANCE</api:l_EmployerName>
//      <api:l_Email_verification_Status>N</api:l_Email_verification_Status>
//      <api:l_PAN_Status>1</api:l_PAN_Status>
//      <api:l_Form60_Validity_Period>06/07/2017</api:l_Form60_Validity_Period>
//      <api:l_Aadhaar_Type>1</api:l_Aadhaar_Type>
//      <api:l_AadharCardNo>540929617304</api:l_AadharCardNo>
//      <api:l_Date_of_Enrolment>06/07/2017</api:l_Date_of_Enrolment>
		
		
		return customFields;
	}
}