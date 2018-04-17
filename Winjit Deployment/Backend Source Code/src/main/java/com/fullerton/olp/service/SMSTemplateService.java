/**
 * 
 */
package com.fullerton.olp.service;

import java.util.Collection;

import com.fullerton.olp.model.SMSTemplate;

/**
 * @author saurabh.shastri
 *
 */
public interface SMSTemplateService extends GenericEntityService<SMSTemplate, Long> {

	SMSTemplate findById(Long id);
	
    Collection<SMSTemplate> findAll();
}
