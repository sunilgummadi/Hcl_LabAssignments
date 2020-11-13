/**
 * 
 */
package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunil
 *
 */
public class UserMainCode {
	public static String convertDateFormat(String date1) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse(date1);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat2.format(date).toString();
	}
}
