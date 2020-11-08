package com.main;

import java.util.Scanner;

import com.pojo.Pangram;

public class PanagramMain {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (Pangram.isPangram(string)) {
			System.out.println("Pangram");
		} else
			System.out.println("Not Pangram");
		scanner.close();
	}

}
