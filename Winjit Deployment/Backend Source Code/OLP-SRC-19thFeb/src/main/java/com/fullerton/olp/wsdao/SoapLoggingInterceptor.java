package com.fullerton.olp.wsdao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptorAdapter;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

public class SoapLoggingInterceptor extends ClientInterceptorAdapter {

    final static Logger log = LoggerFactory.getLogger(SoapLoggingInterceptor.class);
     
    @Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
    		log.error("===========================request begin================================================");
//        log.error("URI         : {}", request.getURI());
//        
//        log.error("Headers     : {}", request.getHeaders() );
//        log.error("Request body: {}", new String(body, "UTF-8"));
        
    		try {
    				log.error("Method      : {}", ((SaajSoapMessage) messageContext.getRequest()).getSaajMessage().getMimeHeaders().getHeader("SOAPAction")[0]);
    				ByteArrayOutputStream os = new ByteArrayOutputStream();
    				messageContext.getRequest().writeTo(os);
    				log.error("Request body: {}", os.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		log.error("==========================request end================================================");
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		
		log.error("============================response begin==========================================");
//        log.error("Status code  : {}", response.getStatusCode());
//        log.error("Status text  : {}", response.getStatusText());
//        log.error("Headers      : {}", response.getHeaders());
//        log.error("Response body: {}", inputStringBuilder.toString());
        
        
        try {
        		ByteArrayOutputStream os = new ByteArrayOutputStream();
			messageContext.getResponse().writeTo(os);
			log.error("Response body: {}", os.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        log.error("=======================response end=================================================");
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		try {
			messageContext.getResponse().writeTo(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
    		log.info("=========================API CALL COMPLETED=========================");
    }
}