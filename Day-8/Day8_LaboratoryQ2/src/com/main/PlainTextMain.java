/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a Java program to write and read a plain text file
 * 
 * @author sunil
 *
 */
public class PlainTextMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("text.txt");// creating the file in project folder
			String msg = "Hello welcome to new world";
			fileWriter.write(msg);
			fileWriter.close();
			FileReader fileReader = new FileReader("text.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int data;
			while ((data = bufferedReader.read()) != -1) {
				System.out.print((char) data);
			}

			bufferedReader.close();
			fileReader.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
