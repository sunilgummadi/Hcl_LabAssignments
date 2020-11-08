package com.main;

import java.util.Scanner;

import com.pojo.CountVowels;

public class VowelsCountMain {

	public static void main(String[] args) {
		System.out.println("Enter the string to count vowels in it :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Total number of vowels in string "+string+" are :"+CountVowels.count(string));
		scanner.close();
	}

}
