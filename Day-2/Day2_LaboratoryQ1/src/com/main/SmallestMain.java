package com.main;

import java.util.Scanner;

import com.pojo.SmallestAmongThree;

public class SmallestMain {

	public static void main(String[] args) {
		System.out.println("Enter three inputs :");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.println("Smallest of " + num1 + ", " + num2 + ", " + num3 + " :"
				+ SmallestAmongThree.smallest(num1, num2, num3));
		scanner.close();
	}

}
