package com.main;

import java.util.Scanner;

import com.pojo.SubString;

public class SubStringMain {

	public static void main(String[] args) {
		System.out.println("Enter string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Enter the starting and ending index to print substring:");
		int startIndex = scanner.nextInt();
		int endIndex = scanner.nextInt();
		System.out.println(
				"The required subtring of " + string + " is :" + SubString.subStr(string, startIndex, endIndex));
		scanner.close();
	}

}
