package com.fullerton.olp.settings.email;

import java.util.Map;

import com.fullerton.olp.model.EmailTemplate;


public interface TemplateService {
	String getFormattedText(String templatePath, Map<String, String> data);

	String getFormattedText(EmailTemplate emailTemplate, Map<String, String> data);

	String getFormattedText(String templatePath);

	String getFormattedText(String templatePath, Map<String, String> contentToReplace, Map<String, String> listToShow);
	
}
