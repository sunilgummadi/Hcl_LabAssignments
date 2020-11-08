package com.main;

import java.util.Scanner;

import com.pojo.ArraySorting;

public class SortingMain {

	public static void main(String[] args) {
		System.out.println("Enter 10 integer values to sort them :");
		int[] nums = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			nums[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("After sorting the array became :");
		ArraySorting.sort(nums);
		for(int i =0;i<10;i++) {
			System.out.println(nums[i]);
		}
		scanner.close();
	}

}
