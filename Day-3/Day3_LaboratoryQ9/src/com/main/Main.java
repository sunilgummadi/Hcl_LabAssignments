package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;

public final class Main {

	public static void main(String[] args) {
		System.out.println("Enter the string to reshape:");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Enter the character to insert :");
		char specialChar = scanner.next().charAt(0);
		System.out.println("After the modifycations the string became :" + UserMainCode.reshape(string, specialChar));
		scanner.close();
	}

}
