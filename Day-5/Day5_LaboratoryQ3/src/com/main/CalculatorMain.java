package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;

public class CalculatorMain {
	static void isValid(int num1, int num2) throws Exception {
		if (num1 == 0 && num2 == 0)
			throw new Exception("n and p should not be zero");
		else if (num1 < 0 || num2 < 0)
			throw new Exception("n or p should not be negative");
	}

	public static void main(String[] args) {
		System.out.println("Enter two integer numbers for calculating power :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		try {
			isValid(num1, num2);
			System.out.println("Power of " + num1 + " and " + num2 + " :" + MyCalculator.power(num1, num2));
		} catch (Exception e) {
			System.out.println(e);
		}
		scanner.close();
	}

}
