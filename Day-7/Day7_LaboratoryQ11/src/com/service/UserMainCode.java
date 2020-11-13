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
	public static int getDateDifference(String date1, String date2) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date3 = dateFormat.parse(date1);
		Date date4 = dateFormat.parse(date2);
		return (int) ((date4.getTime() - date3.getTime()) / (1000 * 24 * 60 * 60));
	}
}
