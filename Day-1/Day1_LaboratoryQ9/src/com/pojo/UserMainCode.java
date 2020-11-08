package com.pojo;

public class UserMainCode {
	public static int sumOfSquaresOfEvenDigits(int num) {
		int sum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			if (isEven(rem)) {
				sum += (rem * rem);
			}
			num /= 10;
		}
		return sum;
	}

	public static boolean isEven(int num1) {
		return num1 % 2 == 0;
	}
}
