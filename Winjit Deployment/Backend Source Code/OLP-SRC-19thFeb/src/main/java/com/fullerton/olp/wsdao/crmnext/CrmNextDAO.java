package com.fullerton.olp.wsdao.crmnext;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import com.fullerton.olp.model.UserDetail;
import com.fullerton.olp.wsdao.bre.model.InvokeBREResponse;


/**
 * Sample client to invoice WS
 * 
 * @author nitish
 *
 */
public interface CrmNextDAO  {

	@Retryable(maxAttempts = 3, backoff = @Backoff(delay = 15000))
	public String createLead(UserDetail userDetail , InvokeBREResponse invokeBREResponse ) ;

}