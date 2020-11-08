package com.main;

import java.util.Scanner;

import com.pojo.SumOfOdd;

public class SumOfOddMain {

	public static void main(String[] args) {
		System.out.println("Enter the number to check sum of odd:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (SumOfOdd.checkSum(num) == 1) {
			System.out.println("Sum of odd digits is odd");
		} else {
			System.out.println("Sum of odd digits is even");
		}
		scanner.close();
	}

}
