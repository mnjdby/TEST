package com.fullerton.olp.wsdao;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptorAdapter;
import org.springframework.ws.context.MessageContext;

public class SoapLoggingInterceptor extends ClientInterceptorAdapter {

    final static Logger log = LoggerFactory.getLogger(SoapLoggingInterceptor.class);
     
    @Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
    		System.out.println("Request :");
    		try {
				messageContext.getRequest().writeTo(System.out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		System.out.println("\nResponse : ");
        try {
			messageContext.getResponse().writeTo(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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