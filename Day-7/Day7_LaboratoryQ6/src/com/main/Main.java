/**
 * 
 */
package com.main;

import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Include a class UserMainCode with a static method “getNumberOfDays” that
 * accepts 2 integers as arguments and returns an integer. The first argument
 * corresponds to the year and the second argument corresponds to the month
 * code. The method returns an integer corresponding to the number of days in
 * the month. Create a class Main which would get 2 integers as input and call
 * the static method getNumberOfDays present in the UserMainCode.
 * 
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
		System.out.println("Enter the year :");
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the month code :");
		int monthCode = scanner.nextInt();
		System.out.println(
				"Number of  days in that particular month is :" + UserMainCode.getNumberOfDays(year, monthCode));
		scanner.close();
	}

}
