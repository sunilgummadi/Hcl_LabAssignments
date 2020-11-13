/**
 * 
 */
package com.main;

import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Write a program to read a string and validate the IP address. Print “Valid”
 * if the IP address is valid, else print “Invalid”.
 * 
 * Include a class UserMainCode with a static method ipValidator which accepts a
 * string. The return type (integer) should return 1 if it is a valid IP address
 * else return 2.
 * 
 * Create a Class Main which would be used to accept Input String and call the
 * static method present in UserMainCode.
 * 
 * Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between
 * 0-255.
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
		System.out.println("Enter the ip address to check validity :");
		String ip = scanner.nextLine();
		if (UserMainCode.ipValidator(ip) == 1) {
			System.out.println("The entered ip address is valid ");
		} else
			System.out.println("The entered ip address is not valid");
		scanner.close();
	}

}
