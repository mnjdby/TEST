package com.fullerton.olp.wsdao.crmnext;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.wsdao.bre.model.InvokeBREResponse;
import com.fullerton.olp.wsdao.crmnext.model.ArrayOfSaveResult;
import com.fullerton.olp.wsdao.crmnext.model.ObjectFactory;
import com.fullerton.olp.wsdao.crmnext.model.Save;
import com.fullerton.olp.wsdao.crmnext.model.SaveResponse;


/**
 * Sample client to invoice WS
 * 
 * @author nitish
 *
 */
public class CrmNextDAOImpl extends WebServiceGatewaySupport implements CrmNextDAO{

	private static final Logger log = LoggerFactory.getLogger(CrmNextDAO.class);

	public String createLead(UserDetail userDetail , InvokeBREResponse invokeBREResponse ) {
		Save saveRequest = new ObjectFactory().createSave();
        
		//saveRequest.setUserContext(value);
		//log.info("Creating new account with request: " + request);

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

}