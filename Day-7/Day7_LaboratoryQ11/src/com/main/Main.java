/**
 * 
 */
package com.main;

import java.text.ParseException;
import java.util.Scanner;
import com.service.UserMainCode;

/**
 * Get two date strings as input and write code to find difference between two
 * dates in days.
 * 
 * Include a class UserMainCode with a static method getDateDifference which
 * accepts two date strings as input.
 * 
 * The return type of the output is an integer which returns the diffenece
 * between two dates in days.
 * 
 * Create a class Main which would get the input and call the static method
 * getDateDifference present in the UserMainCode.
 * 
 * @author sunil
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date1 :");
		String date1 = scanner.nextLine();
		System.out.println("Enter the date2");
		String date2 = scanner.nextLine();
		try {
			System.out.println("Number of days in given two dates :" + UserMainCode.getDateDifference(date1, date2));
		} catch (ParseException e) {
			System.err.println(e);
		}
		
		scanner.close();
	}

}
