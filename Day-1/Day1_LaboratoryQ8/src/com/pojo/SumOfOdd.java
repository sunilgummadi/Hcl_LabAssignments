package com.pojo;

public class SumOfOdd {
	public static int checkSum(int num) {
		int sum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			if (isOdd(rem)) {
				sum += rem;
			}
			num /= 10;
		}
		if (isOdd(sum))
			return 1;
		else
			return -1;
	}

	public static boolean isOdd(int num1) {
		return num1 % 2 == 1;
	}
}
