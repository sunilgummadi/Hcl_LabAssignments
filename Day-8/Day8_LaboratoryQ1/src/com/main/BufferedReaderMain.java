/**
 * Write a Java program by using BufferedReader class to prompt a user to input
 * his/her name and then the output will be shown as an example below:
 */
package com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author sunil
 *
 */
public class BufferedReaderMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name :");
		String name;
		try {
			name = bufferedReader.readLine();
			System.out.println("Hello " + name + " !");
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			bufferedReader = null;
			name = null;
		}
	}

}
