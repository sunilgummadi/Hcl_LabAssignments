/**
 * 
 */
package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Employee;

/**
 * @author sunil
 *
 */
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		System.out.println("Enter the number of employee objects you want to create :");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		scanner.nextLine();
		int id;
		String name;
		double salary;
		Employee employee;
		for (int i = 0; i < size; i++) {
			id = scanner.nextInt();
			scanner.nextLine();
			name = scanner.nextLine();
			salary = scanner.nextDouble();
			scanner.nextLine();
			employee = new Employee(id, name, salary);
			emp.add(employee);
		}
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));
		}
	}

}
