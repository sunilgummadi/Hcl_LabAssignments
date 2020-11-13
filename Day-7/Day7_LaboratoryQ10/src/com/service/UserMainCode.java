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
	public static String findOldDate(String date1, String date2) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date3 = dateFormat.parse(date1);
		Date date4 = dateFormat.parse(date2);
		if (date3.compareTo(date4) > 0) {//date3 comes after date4 since date4 is older which is date2 string
			return date2;
		} else {
			return date1;
		}
	}
}
