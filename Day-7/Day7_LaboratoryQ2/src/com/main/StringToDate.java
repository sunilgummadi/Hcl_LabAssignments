/**
 * 
 */
package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Write a Java program to extract date, time from the date string
 * @author sunil
 *
 */
public class StringToDate {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		System.out.println("Enter the date in the format dd/MM/yyyy HH:mm:ss");
		Scanner scanner = new Scanner(System.in);
		String dateString = scanner.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = dateFormat.parse(dateString);
		System.out.println("Date and time from entered string is :"+date);
		scanner.close();
	}

}
