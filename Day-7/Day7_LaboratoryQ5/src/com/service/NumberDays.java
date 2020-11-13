/**
 * 
 */
package com.service;

import java.time.LocalDate;

/**
 * @author sunil
 *
 */
public class NumberDays {
	public int getDays(int year, int month) {
		LocalDate date = LocalDate.of(year, month, 01);// new feature in java 8
		if (date.isLeapYear() && month == 1) {
			return 29;
		}
		if (month == 1)
			return 28;
		if (month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11)
			return 31;
		return 30;
	}
}
