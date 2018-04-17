package com.fullerton.olp.service;

import java.io.IOException;
import java.util.Collection;

import org.springframework.web.multipart.MultipartFile;

import com.fullerton.olp.bean.AadhaarOtpKeyRequest;
import com.fullerton.olp.bean.OtpRequest;
import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML;

public interface UserDetailService extends GenericEntityService<UserDetail, Long>{

	UserDetail findById(Long id);
	
    Collection<UserDetail> findAll();

    Boolean verifyOtp(Long userDetailId, OtpRequest otp);
    Boolean resendOtp(Long userDetailId);
    UserDetail saveAadhaar(Long userDetailId, UserDetail entity) ;
    UserDetail saveDetailData(UserDetail entity) ;
    
    Boolean generateAadharOtp(Long userDetailId);
    Boolean verifyAadhaarOtp(Long userDetailId, AadhaarOtpKeyRequest otpRequestToBeSent);
    
    UserDetail createCPAccount(Long userDetailId);
    FetchOutputNewApplicationXML fetchNewApplicationXML(Long userDetailId);
    
    Boolean saveFile(Long userDetailId, Long documentTypeId, Long documentId, MultipartFile file);
    
    Boolean attemptedInThePast(UserDetail userDetail);
    
    Boolean attemptedPanInThePast(UserDetail userDetail);
    
    void interactWithTPSystems(Long userDetailId) throws IOException;
}
