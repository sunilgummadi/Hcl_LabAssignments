package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleOpening {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		int ch;
		try {

			fileReader = new FileReader("sunil.txt");// if the file is not present it will stop executing and shows
														// fileNotfound exception so using try catch block I handled the
														// exception
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		while ((ch = fileReader.read()) != -1) {
			System.out.print((char) ch);
		}
		fileReader.close();
		System.out.println("\nrest of the code");
	}
}
