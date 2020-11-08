package com.main;

import java.util.Scanner;

import com.pojo.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		System.out.println("Enter the array size :");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		scanner.nextLine();
		if (size > 0) {
			System.out.println("Enter the array elements :");
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				scanner.nextLine();
			}
			Addition.customAddition(array);
		} else {
			System.out.println("Please enter the size of array >0");
		}
		scanner.close();
	}

}
