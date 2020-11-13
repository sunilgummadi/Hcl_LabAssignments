/**
 * 
 */
package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Given a method with two date strings in yyyy-mm-dd format as input. Write
 * code to find the difference between two dates in months.
 * 
 * Include a class UserMainCode with a static method getMonthDifference which
 * accepts two date strings as input.
 * 
 * The return type of the output is an integer which returns the diffenece
 * between two dates in months.
 * 
 * Create a class Main which would get the input and call the static method
 * getMonthDifference present in the UserMainCode.
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
		System.out.println("Enter date1 in the format yyyy-mm-ddd :");
		String date1 = scanner.nextLine();
		System.out.println("Enter date2 in the format yyyy-mm-ddd :");
		String date2 = scanner.nextLine();
		try {
			System.out.println("Difference months between the dates :" + UserMainCode.getMonthDifference(date1, date2));
		} catch (ParseException e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
