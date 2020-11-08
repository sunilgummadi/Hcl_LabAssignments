package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two inputs :");
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		Calculator calculator = new Calculator();
		System.out.println("Addition of " + num1 + " and " + num2 + " is :" + calculator.add(num1, num2));
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is :" + calculator.subtract(num1, num2));
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + calculator.multiply(num1, num2));
		System.out.println("Division of " + num1 + " and " + num2 + " is :" + calculator.division(num1, num2));
		System.out.println("Modulus of " + num1 + " and " + num2 + " is :" + calculator.modulus(num1, num2));
		scanner.close();
		calculator = null;
		System.gc();
	}
}
