package com.main;

import java.util.Scanner;

import com.pojo.CustomConvertion;

public class CustomConvertionMain {

	public static void main(String[] args) {
		System.out.println("Enter the string for convertion of d to h :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("After convertion string " + string + " became " + CustomConvertion.convertDtoH(string));
		scanner.close();
	}

}
