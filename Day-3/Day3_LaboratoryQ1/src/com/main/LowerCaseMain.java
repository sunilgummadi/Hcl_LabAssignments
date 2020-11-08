package com.main;

import java.util.Scanner;

import com.pojo.StringLowerCase;

public class LowerCaseMain {

	public static void main(String[] args) {
		System.out.println("Enter the string to convert into lower case :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		StringLowerCase stringLowerCase = new StringLowerCase();
		System.out.println("Lower case of " + string + " is :" + stringLowerCase.lowerCase(string));
		scanner.close();
		stringLowerCase = null;
	}

}
