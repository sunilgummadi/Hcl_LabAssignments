package com.main;

import java.util.Scanner;

import com.pojo.Prime;

public class PrimeMain {

	public static void main(String[] args) {
		System.out.println("Enter the number to check prime:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Prime prime = new Prime();
		if (prime.isPrime(num)) {
			System.out.println("Entered number " + num + " is Prime");
		} else
			System.out.println("Entered number " + num + " is not a Prime");
		scanner.close();
		prime = null;
	}
	
}
