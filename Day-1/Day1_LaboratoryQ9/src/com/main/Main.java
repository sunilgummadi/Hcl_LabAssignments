package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the positive number :");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Sum of squares of even numbers is :" + UserMainCode.sumOfSquaresOfEvenDigits(num));
		scanner.close();
	}

}
