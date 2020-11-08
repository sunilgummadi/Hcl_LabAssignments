package com.main;

import java.util.Scanner;

import com.pojo.Ascii;

public class AsciiMain {

	public static void main(String[] args) {
		System.out.println("Enter the character to print its ascii :");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		Ascii ascii = new Ascii();
		System.out.println("The ascii of given char is :" + ascii.ascii(ch));
		scanner.close();
		ascii = null;
	}

}
