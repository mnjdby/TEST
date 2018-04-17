package com.fullerton.olp.settings.configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

import com.fullerton.olp.wsdao.RestLoggingInterceptor;
import com.fullerton.olp.wsdao.SoapLoggingInterceptor;
import com.fullerton.olp.wsdao.bre.BreDAO;
import com.fullerton.olp.wsdao.bre.BreDAOImpl;
import com.fullerton.olp.wsdao.cp.ConnectPlusDAO;
import com.fullerton.olp.wsdao.cp.ConnectPlusDAOImpl;
import com.fullerton.olp.wsdao.crmnext.CrmNextDAO;
import com.fullerton.olp.wsdao.crmnext.CrmNextDAOImpl;

/**
 *  ws client configuration
 * 
 * @author nitish
 *
 */
@Configuration
public class WsClientConfiguration {

	@Value("${crm-ws.host}")
	private String CRM_WS_HOST;
	
	@Value("${cp-ws.host}")
	private String CP_WS_HOST;
	
	@Value("${bre-ws.host}")
	private String BRE_WS_HOST;
	
	@Bean
	public Jaxb2Marshaller cpMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.fullerton.olp.wsdao.cp.model");
		return marshaller;
	}
	
	@Bean
	public Jaxb2Marshaller breMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.fullerton.olp.wsdao.bre.model");
		return marshaller;
	}
	@Bean
	public Jaxb2Marshaller crmMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("com.fullerton.olp.wsdao.crmnext.model");
		return marshaller;
	}

	@Bean
	public ConnectPlusDAO createConnectPlusClient(Jaxb2Marshaller cpMarshaller, SoapLoggingInterceptor soapLoggingInterceptor) {
		ConnectPlusDAOImpl client = new ConnectPlusDAOImpl();
		List<ClientInterceptor> interceptors = new ArrayList<ClientInterceptor>();
		interceptors.add(soapLoggingInterceptor);
		client.getWebServiceTemplate().setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
		client.setDefaultUri(CP_WS_HOST);
		client.setMarshaller(cpMarshaller);
		client.setUnmarshaller(cpMarshaller);
		return client;
	}
	
	@Bean
	public CrmNextDAO createCrmClient(Jaxb2Marshaller crmMarshaller, SoapLoggingInterceptor soapLoggingInterceptor) {
		CrmNextDAOImpl client = new CrmNextDAOImpl();
		List<ClientInterceptor> interceptors = new ArrayList<ClientInterceptor>();
		interceptors.add(soapLoggingInterceptor);
		client.getWebServiceTemplate().setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
		client.setDefaultUri(CRM_WS_HOST);
		client.setMarshaller(crmMarshaller);
		client.setUnmarshaller(crmMarshaller);
		return client;
	}
	
	@Bean
	public BreDAO createBreClient(Jaxb2Marshaller breMarshaller, SoapLoggingInterceptor soapLoggingInterceptor) {
		List<ClientInterceptor> interceptors = new ArrayList<ClientInterceptor>();
		interceptors.add(soapLoggingInterceptor);
		BreDAOImpl client = new BreDAOImpl();
		client.getWebServiceTemplate().setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
		client.setDefaultUri(BRE_WS_HOST);
		client.setMarshaller(breMarshaller);
		client.setUnmarshaller(breMarshaller);
		return client;
	}
	

	@Bean
	public SoapLoggingInterceptor soapLoggingInterceptor() {
		return new SoapLoggingInterceptor();
	}
	/*
	@Bean
	public WebServiceTemplate webServiceTemplate(SoapLoggingInterceptor soapLoggingInterceptor) {
		List<ClientInterceptor> interceptors = new ArrayList<ClientInterceptor>();
		interceptors.add(soapLoggingInterceptor);
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setInterceptors(interceptors.toArray(new ClientInterceptor[0]));
        return webServiceTemplate;
	}*/
}