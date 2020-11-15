/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a Java program to append text to an existing file.
 * 
 * @author sunil
 *
 */
public class AppendingToExistFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Printing the data in the existing file
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));// text.txt file is present
																							// in project folder so no
																							// need to specify the
																							// entire path
			int data;
			System.out.println("Printing the data in the existing file");
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}
			// Appending to data to the existing file
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter the message to be appended into the file :");
			String msg = bufferedReader2.readLine();
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));
			bufferedWriter.append(msg);
			bufferedWriter.close();
			System.out.println("\nPrinting the data after appending in the existing file");
			BufferedReader bufferedReader3 = new BufferedReader(new FileReader("text.txt"));
			while ((data = bufferedReader3.read()) != -1) {
				System.out.print((char) data);
			}
			bufferedReader.close();
			bufferedReader2.close();
			bufferedReader3.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
