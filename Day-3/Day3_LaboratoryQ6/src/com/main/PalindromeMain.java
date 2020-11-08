package com.main;

import java.util.Scanner;

import com.pojo.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		System.out.println("Enter the string to check palindrome :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (Palindrome.isPalindrom(string))
			System.out.println("Yes");
		else
			System.out.println("No");
		scanner.close();
	}

}
