/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a Java program to find the longest word in a text file.
 * 
 * @author sunil
 *
 */
public class LongestWordInFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
			//text.txt was present in the project folder
			System.out.println("Printing data in the file :");
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			Scanner scanner = new Scanner(new File("text.txt"));
			String longestString = "";
			String currentString;
			while (scanner.hasNext()) {
				currentString = scanner.next();
				if (currentString.length() > longestString.length()) {
					longestString = currentString;
				}
			}
			System.out.println("Longest string in given file is :" + longestString);
			scanner.close();
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
			// e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
