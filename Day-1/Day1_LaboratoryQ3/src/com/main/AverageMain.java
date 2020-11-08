package com.main;

import java.util.Scanner;

import com.pojo.Average;

public class AverageMain {

	public static void main(String[] args) {
		System.out.println("Enter three numbers to calculate average :");
		Scanner scanner = new Scanner(System.in);
		float num1 = scanner.nextFloat();
		float num2 = scanner.nextFloat();
		float num3 = scanner.nextFloat();
		Average average = new Average();
		System.out.println(
				"Average of " + num1 + ", " + num2 + ", " + num3 + " is :" + average.average(num1, num2, num3));
		scanner.close();
		average = null;
		System.gc();
	}

}
