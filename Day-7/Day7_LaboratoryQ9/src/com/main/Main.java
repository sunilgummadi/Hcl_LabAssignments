/**
 * 
 */
package com.main;

import java.util.HashMap;
import java.util.Scanner;

import com.pojo.Employee;
import com.service.UserMainCode;

/**
 * @author sunil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of details you wish to enter :");
		int size = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name and designation of " + size + " employees :");
		HashMap<String, String> details = new HashMap<String, String>();
		Employee employee;

		for (int i = 0; i < size; i++) {

			employee = new Employee(scanner.nextLine(), scanner.nextLine());
			details.put(employee.getName(), employee.getDesignation());
		}
		System.out.println("Enter required designation :");
		String designation = scanner.nextLine();
		String[] result = UserMainCode.obtainDesignation(details, designation);
		System.out.println("Employees matching with designation are :");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null)
				System.out.println(result[i]);
		}
		scanner.close();
		details = null;
		employee = null;
	}

}
