package com.fullerton.olp.wsdao.cp;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.settings.util.DateUtil;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML;
import com.fullerton.olp.wsdao.cp.model.InputNewApplicationXML;
import com.fullerton.olp.wsdao.cp.model.ObjectFactory;
import com.fullerton.olp.wsdao.cp.model.Ticket;


/**
 * Client to invoke CP WS
 * 
 * @author nitish
 *
 */
public class ConnectPlusDAOImpl extends WebServiceGatewaySupport implements ConnectPlusDAO {

	private static final Logger log = LoggerFactory.getLogger(ConnectPlusDAO.class);

	public String createNewAccount(UserDetail userDetail) {
		
		InputNewApplicationXML request = new ObjectFactory().createInputNewApplicationXML();
		
		request.setApplicantBlockConsumerName1(userDetail.getName());
		request.setApplicantBlockConsumerName2("");//TODO check if second param will be ok after name splitting
		
		request.setControlBlockReferenceNumber("1616175");
		request.setControlBlockCallType("01");
		request.setControlBlockSearchType("2");
		request.setControlBlockScoreType("1");
		request.setControlBlockStrategyCode("01");
		request.setControlBlockSearchPreviousApplications("1");
		
		request.setApplicantBlockApplicantType("01");
		request.setApplicantBlockGender("F");//TODO how do i get it ?
		request.setApplicantBlockPrefix("Mrs");
		
		request.setApplicantBlockIDNumber2(userDetail.getProfessionalDetail().getPanNumber());
		request.setApplicantBlockNationality("356");
		request.setApplicantBlockDateOfBirth("");
		request.setApplicantBlockPlaceOfBirth("356");
		
		request.setApplicantBlockOtherMilitaryServiceStatus("N");
		request.setApplicantBlockOtherExistingCustomer("0");
		
		request.setApplicantBlockContactDetailsMobileTelephoneNumber(userDetail.getMobile());
		request.setApplicantBlockContactDetailsEmailAddress(userDetail.getEmail());
		
		request.setApplicantBlockEmploymentDetailsAddressLine1("");
		request.setApplicantBlockEmploymentDetailsAddressLine2("");
		request.setApplicantBlockEmploymentDetailsAddressLine3("");
		request.setApplicantBlockEmploymentDetailsAddressLine6("");
		request.setApplicantBlockEmploymentDetailsAddressLine7("");
		request.setApplicantBlockEmploymentDetailsAddressLine11("");
		
		request.setCreditBlockFinanceEnquiryType("5");
		request.setCreditBlockPurposeOfFinance("5");
		request.setCreditBlockAmountOfFinance("400000");
		
        
		request.setControlBlockApplicationDate(DateUtil.getDateCPString(new Date()));
		request.setControlBlockCountryCode("365");
		request.setControlBlockNumberOfApplicants("1");
		
		request.setApplicantBlockIDDocumentType1("P");
		request.setApplicantBlockIDIssuingCountry1("356");
		request.setApplicantBlockIDDocumentType2("T");
		request.setApplicantBlockIDIssuingCountry2("356");
		request.setApplicantBlockIDDocumentType3("V");
		 
		request.setApplicantBlockIDIssuingCountry3("356");
		request.setApplicantBlockIDDocumentType4("D");
		request.setApplicantBlockIDIssuingCountry4("356");
		request.setApplicantBlockCitizenship("356");
		
		request.setApplicantBlockEmploymentDetailsTimeInEmploymentYYMM("0200");
		request.setApplicantBlockEmploymentDetailsAddressCountryCode("356");
		request.setApplicantBlockOtherBureauSearchConsent("1");
		request.setApplicantBlockDecisionFinalDecision("ACCPT");
		request.setApplicantBlockContactDetailsWorkTelephoneNumber("43744900");
		 
		request.setApplicantBlockAddressDetailsResidentialCountryCode("356");
		request.setApplicantBlockAddressDetailsResidentialAddressLine11("");
		request.setApplicantBlockAddressDetailsResidentialAddressLine7("");
		request.setApplicantBlockAddressDetailsResidentialAddressLine1("");
		request.setApplicantBlockAddressDetailsResidentialAddressLine6("");
		request.setApplicantBlockAddressDetailsResidentialAddressLine2("");
		request.setApplicantBlockAddressDetailsResidentialAddressLine3("");
		
        
		request.setControlBlockCurrencyCode("INR");
		request.setControlBlockLanguageCode("E");
        
		request.setApplicantBlockContactDetailsHomeInternationalCode("91");
		request.setApplicantBlockContactDetailsMobileInternationalDialCode("91");
		request.setApplicantBlockContactDetailsWorkInternationalDialCode("91");
		
		request.setApplicantBlockEmploymentDetailsEmploymentStatus("D");
		request.setApplicantBlockAddressDetailsResidentialTimeAtCurrentAddressYYMM("0400");
        
		QName qName = new QName("com.winjit.soap.client", "InputNewApplicationXML");
	    JAXBElement<InputNewApplicationXML> root = new JAXBElement<>(qName, InputNewApplicationXML.class, request);
	  
		log.info("Creating new account with request: " + root);
		 
		
		JAXBElement<Ticket> response =  (JAXBElement)getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						root,
						new SoapActionCallback("asynchronousNewApplicationXML"));

		return response.getValue().getTicketNumber().toString();
	}
	
	public FetchOutputNewApplicationXML fetchNewApplicationXML(String ticketNumber ) {
		
		Ticket ticket =  new ObjectFactory().createTicket();
		ticket.setTicketNumber(BigInteger.valueOf(Long.parseLong(ticketNumber)));
		
		//JAXBElement<Ticket> request = new ObjectFactory().createFetchInputNewApplicationXML(ticket);
		
		QName qName = new QName("com.winjit.soap.client", "fetchInputNewApplicationXML");
	    JAXBElement<Ticket> root = new JAXBElement<Ticket>(qName, Ticket.class, ticket);
	  
		log.info("Creating new account with request: " + root);
		
		FetchOutputNewApplicationXML response =  (FetchOutputNewApplicationXML) getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						root,
						new SoapActionCallback("fetchNewApplicationXML"));

		return response;
	}

}