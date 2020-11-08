package com.main;

import java.util.Scanner;

import com.exception.CustomException;
import com.pojo.Player;

public class PlayerMain {
	static void isValidAge(int age) throws CustomException {
		if (age < 19)
			throw new CustomException("InvalidAgeRangeException");
	}

	public static void main(String[] args) {
		System.out.println("Enter Player name :");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Enter Players age :");
		int age = scanner.nextInt();
		try {
			isValidAge(age);
			Player player = new Player(name, age);
			System.out.println("Player name :" + player.getName());
			System.out.println("Player age :" + player.getAge());
		} catch (CustomException e) {
			System.out.println(e);
		}
		scanner.close();
	}

}
