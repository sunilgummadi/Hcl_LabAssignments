package com.main;

import java.util.Scanner;

import com.pojo.LongestString;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Longest word in given string is :" + LongestString.getLargestWord(string));
		scanner.close();
	}

}
