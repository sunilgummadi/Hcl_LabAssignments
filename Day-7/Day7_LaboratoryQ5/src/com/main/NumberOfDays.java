/**
 * 
 */
package com.main;

import java.util.Scanner;

import com.service.NumberDays;

/**
 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...),
 * write a program to find out total number of days in the given month for the
 * given year.
 * 
 * @author sunil
 *
 */
public class NumberOfDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter year :");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter month to find number of days in that month :");
		int month = scanner.nextInt();
		System.out.println("Number of days =" + new NumberDays().getDays(year, month));
		scanner.close();
	}

}
