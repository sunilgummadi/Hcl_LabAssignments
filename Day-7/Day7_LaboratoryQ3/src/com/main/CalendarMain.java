package com.main;

/**
 * 
 */

import java.util.Calendar;

/**
 * Write a Java program to get and display information (year, month, day, hour,
 * minute) of a default calendar
 * 
 * @author sunil
 *
 */
public class CalendarMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Year :" + calendar.get(Calendar.YEAR));
		System.out.println("Month :" + calendar.get(Calendar.MONTH));
		System.out.println("Day :" + calendar.get(Calendar.DATE));
		System.out.println("Hour :" + calendar.get(Calendar.HOUR));
		System.out.println("Minute :" + calendar.get(Calendar.MINUTE));
		System.out.println("Second :" + calendar.get(Calendar.SECOND));
	}

}
