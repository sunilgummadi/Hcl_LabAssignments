package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the number to print sum of factors :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		MyCalculator calculator = new MyCalculator();
		System.out.println("Sum of factors of " + num + " :" + calculator.divisor_sum(num));
		scanner.close();
		calculator = null;
	}

}
