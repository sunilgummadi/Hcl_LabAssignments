/**
 * 
 */
package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Given a date string in the format dd/mm/yyyy, write a program to convert the
 * given date to the format dd-mm-yy.
 * 
 * Include a class UserMainCode with a static method “convertDateFormat” that
 * accepts a String and returns a String.
 * 
 * Create a class Main which would get a String as input and call the static
 * method convertDateFormat present in the UserMainCode.
 * 
 * @author sunil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date in dd/mm/yyyy format :");
		String date = scanner.nextLine();
		try {
			System.out.println("Entered date is converted into dd-mm-yyyy :" + UserMainCode.convertDateFormat(date));
		} catch (ParseException e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
