package com.fullerton.olp.wsdao.bre;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.xml.transform.StringResult;

import com.fullerton.olp.wsdao.bre.model.InvokeBRE;
import com.fullerton.olp.wsdao.bre.model.InvokeBREResponse;
import com.fullerton.olp.wsdao.bre.model.ObjectFactory;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML.RawData;
import com.fullerton.olp.wsdao.cp.model.FetchOutputNewApplicationXML.TransactData;


/**
 * Client to invoke BRE WS
 * 
 * @author nitish
 *
 */
public class BreDAOImpl extends WebServiceGatewaySupport implements BreDAO {

	private static final Logger log = LoggerFactory.getLogger(BreDAOImpl.class);

	public InvokeBREResponse invokeBRE(FetchOutputNewApplicationXML fetchOutputNewApplicationXML) throws XmlMappingException, IOException {
		InvokeBRE invokeBRE = new ObjectFactory().createInvokeBRE();
		
		QName qName = new QName("com.winjit.soap.client", "TransactData");
	    JAXBElement<TransactData> transactionDataElement = new JAXBElement<>(qName, TransactData.class, fetchOutputNewApplicationXML.getTransactData());
	  
	    
		StringResult transactionData = new StringResult();
		getWebServiceTemplate().getMarshaller().marshal(transactionDataElement, transactionData);
		invokeBRE.setObjModel("<![CDATA["+transactionData.toString()+"]]");
		
		
		QName qNameR = new QName("com.winjit.soap.client", "RawData");
	    JAXBElement<RawData> rawDataElement = new JAXBElement<>(qNameR, RawData.class, fetchOutputNewApplicationXML.getRawData());
	    StringResult rawData = new StringResult();
		getWebServiceTemplate().getMarshaller().marshal(rawDataElement, rawData);
		
		invokeBRE.setRawData("<![CDATA["+rawData.toString()+"]]");
		log.info("Creating new account with request: " + invokeBRE);

		InvokeBREResponse response = (InvokeBREResponse) getWebServiceTemplate()
				.marshalSendAndReceive(getWebServiceTemplate().getDefaultUri(),
						invokeBRE,
						new SoapActionCallback("invokeBRE"));
		return response;
	}

}