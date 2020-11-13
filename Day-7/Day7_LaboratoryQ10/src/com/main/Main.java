/**
 * 
 */
package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Write a program to read two String variables in DD-MM-YYYY.Compare the two
 * dates and return the older date in 'MM/DD/YYYY' format.
 * 
 * Include a class UserMainCode with a static method findOldDate which accepts
 * the string values. The return type is the string.
 * 
 * Create a Class Main which would be used to accept the two string values and
 * call the static method present in UserMainCode.
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
		System.out.println("Enter the date1 in the format dd-mm-yyyy:");
		String date1 = scanner.nextLine();
		System.out.println("Enter the date2 in the format dd-mm-yyyy:");
		String date2 = scanner.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date oldestDate;
		try {
			oldestDate = dateFormat.parse(UserMainCode.findOldDate(date1, date2));
			System.out.println(
					"Oldest string among the two dates :" + new SimpleDateFormat("MM/dd/yyyy").format(oldestDate));
		} catch (ParseException e) {
			System.err.println(e);
		} finally {
			scanner.close();
			date1 = null;
			date2 = null;
			dateFormat = null;
		}

	}

}
