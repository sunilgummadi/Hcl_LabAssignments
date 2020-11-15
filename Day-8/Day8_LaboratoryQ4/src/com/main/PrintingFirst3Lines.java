/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sunil
 *
 */
public class PrintingFirst3Lines {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// printing the existing file data
		System.out.println("Exsisting file data :");
		BufferedReader bufferedReader = null;
		BufferedReader bufferedReader2 = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("text.txt"));// text.txt file is present in project
																			// folder so no need to specify the entire
																			// path
			int data;
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println("\n");
			System.out.println("Printing first 3 lines :");
			bufferedReader2 = new BufferedReader(new FileReader("text.txt"));
			String line = null;
			int count = 0;
			while ((line = bufferedReader2.readLine()) != null && count < 3) {
				System.out.println(line);
				count++;
			}
			bufferedReader.close();
			bufferedReader2.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			bufferedReader = null;
			bufferedReader2 = null;
		}

	}

}
