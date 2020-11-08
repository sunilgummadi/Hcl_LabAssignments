package com.main;

import java.util.Scanner;

import com.pojo.Swap;

public class SwapMain {

	public static void main(String[] args) {

		System.out.println("Enter the number to be swaped :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		Swap swap = new Swap();
		swap.swap(num1, num2);
		scanner.close();
		swap = null;
	}

}
