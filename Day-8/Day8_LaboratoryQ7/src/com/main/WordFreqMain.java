/**
 * 
 */
package com.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.service.WordFrequency;

/**
 * Write a java program to read the input character stream and identify patterns
 * provided by the user. As the program output display the number of times the
 * pattern occurred in the input character stream.
 * 
 * Read the character stream from the input file (team.txt) that contains the
 * team names and display the output in the console
 * 
 * @author sunil
 *
 */
public class WordFreqMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words:");
		int count = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter strings to be searched :");

		WordFrequency frequency = new WordFrequency();
		String[] patterns = new String[count];
		for (int i = 0; i < count; i++) {
			patterns[i] = scanner.nextLine();
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println("Word " + patterns[i] + " " + frequency.wordFrequency(patterns[i]));
			} catch (FileNotFoundException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		scanner.close();
	}

}
