package com.fullerton.olp.settings.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String CP_WS_DATE_FORMAT = "yyyyMMdd";
	public static final String DB_DATE_FORMAT = "yyyy-MM-dd";
	public static final String FULL_DATE_FORMAT = "yyyyMMddhhmmss";

	public static String getDateCPString(Date date) {
		if (date == null) {
			return "";
		}
		DateFormat format = new SimpleDateFormat(CP_WS_DATE_FORMAT);
		return format.format(date);
	}
	public static String getDateString(Date date) {
		if (date == null) {
			return "";
		}
		DateFormat format = new SimpleDateFormat(FULL_DATE_FORMAT);
		return format.format(date);
	}
	
	public static String getDbDateString(Date date) {
		if (date == null) {
			return "";
		}
		DateFormat format = new SimpleDateFormat(DB_DATE_FORMAT);
		return format.format(date);
	}

	public static Date parseCPDate(String dateStr) {
		DateFormat format = new SimpleDateFormat(CP_WS_DATE_FORMAT);
		try {
			return format.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}