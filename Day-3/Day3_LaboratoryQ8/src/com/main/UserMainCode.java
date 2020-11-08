package com.main;

import java.util.Scanner;

import com.pojo.CustomModify;

public class UserMainCode {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("After the modifycation " + string + " became :" + CustomModify.getString(string));
		scanner.close();
	}

}
