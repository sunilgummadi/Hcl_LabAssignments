package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter two numbers for addition :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		scanner.nextLine();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		Calculator calculator = new Calculator();// we can access the method in another package by creating instance of
													// that class in which our required method is present
		System.out.println("After additon of " + num1 + ", " + num2 + " :" + calculator.add(num1, num2));
		scanner.close();
		calculator = null;
	}

}
