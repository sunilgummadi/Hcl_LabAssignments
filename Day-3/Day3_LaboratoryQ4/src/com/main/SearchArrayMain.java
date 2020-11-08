package com.main;

import java.util.Scanner;

import com.pojo.SearchArray;

public class SearchArrayMain {

	public static void main(String[] args) {
		System.out.println("Enter array elements :");
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10]; // sice in question only 10 elements were given
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Enter search element :");
		int search = scanner.nextInt();
		int index = SearchArray.search(array, search);
		if (index == -1) {
			System.out.println("Entered search element was not in the array");
		} else {
			System.out.println("Entered search element is present at " + index);
		}
		scanner.close();
	}

}
