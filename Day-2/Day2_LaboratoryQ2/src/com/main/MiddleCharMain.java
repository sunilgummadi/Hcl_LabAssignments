package com.main;

import java.util.Scanner;

import com.pojo.MiddleCharacter;

public class MiddleCharMain {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Middle character of " + string + " is :" + MiddleCharacter.findMiddle(string));
		scanner.close();
	}

}
