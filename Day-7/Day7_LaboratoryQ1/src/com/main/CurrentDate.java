/**
 * 
 */
package com.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Write a java program to print current date and time in the specified format.
 * 
 * @author sunil
 *
 */
public class CurrentDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Current date and time is:"+dateTimeFormatter.format(date));
		dateTimeFormatter = null;
		date = null;
	}

}
