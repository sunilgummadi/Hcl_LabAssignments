/**
 * 
 */
package com.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sunil
 *
 */
public class WordFrequency {
	public int wordFrequency(String pattern) throws FileNotFoundException,IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("player.txt"));
		String line = bufferedReader.readLine();
		int patternLength = pattern.length();
		int lineLength = line.length();
		int wordCount =0;
		for(int i=0;i<=lineLength-patternLength;i++) {
			int j=0;
			for(j=0;j<patternLength;j++) {
				if(line.charAt(i+j) != pattern.charAt(j)) {
					break;
				}
			}
			if (j==patternLength) {
				wordCount++;
			}
		}
		bufferedReader.close();
		return wordCount;
	}
		
	
}
