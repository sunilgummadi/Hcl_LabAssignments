package com.main;

import java.util.Scanner;

import com.pojo.B;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter three numbers to add :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		scanner.nextLine();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		int num3 = scanner.nextInt();
		scanner.nextLine();
		B b = new B();
		System.out.println("Sum of " + num1 + ", " + num2 + ", " + num3 + " is :" + b.add(num1, num2, num3));

		System.out.println("Employee total salary :" + b.totalSalary());
		scanner.close();
		b = null;
	}

}
