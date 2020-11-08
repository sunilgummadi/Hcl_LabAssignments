package com.main;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("Enter two integers to compute dvision :");
		Scanner scanner = new Scanner(System.in);

		try {
			int num1 = scanner.nextInt();
			scanner.nextLine();
			int num2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println(e);
		}

		scanner.close();
	}

}
