package com.fullerton.olp.settings.sms;

/**
 * <p>
 * 
 * </p>
 * @author nitishchandrap
 *
 */
public interface SmsService
{
  void send(String from, String to, String body);
}
