/**
 * 
 */
package com.fullerton.olp.service;

import java.util.Collection;

import com.fullerton.olp.model.EmailTemplate;

/**
 * @author saurabh.shastri
 *
 */
public interface EmailTemplateService extends GenericEntityService<EmailTemplate, Long> {

	EmailTemplate findById(Long id);
	
    Collection<EmailTemplate> findAll();
}
