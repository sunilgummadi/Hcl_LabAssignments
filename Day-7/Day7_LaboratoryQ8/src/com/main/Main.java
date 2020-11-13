/**
 * 
 */
package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.service.UserMainCode;

/**
 * Write a code to read two int array lists of size 5 each as input and to merge
 * the two arrayLists, sort the merged arraylist in ascending order and fetch
 * the elements at 2nd, 6th and 8th index into a new arrayList and return the
 * final ArrayList.
 * 
 * Include a class UserMainCode with a static method sortMergedArrayList which
 * accepts 2 ArrayLists.
 * 
 * The return type is an ArrayList with elements from 2,6 and 8th index position
 * .Array index starts from position 0.
 * 
 * Create a Main class which gets two array list of size 5 as input and call the
 * static method sortMergedArrayList present in the UserMainCode.
 * 
 * @author sunil
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		System.out.println("Enter 5 array list 1 elements  of type int :");
		for (int i = 0; i < 5; i++) {
			array1.add(scanner.nextInt());
			scanner.nextLine();
		}
		System.out.println("Enter 5 array list 2 elements  of type int :");
		for (int i = 0; i < 5; i++) {
			array2.add(scanner.nextInt());
			scanner.nextLine();
		}
		ArrayList<Integer> result = UserMainCode.sortMergedArrayList(array1, array2);
		System.out.println("Result :");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		scanner.close();
		array1 = null;
		array2 = null;
		result = null;
	}

}
