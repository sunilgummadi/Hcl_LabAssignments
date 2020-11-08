package com.pojo;

import java.util.HashMap;

public class Pangram {
	public static boolean isPangram(String string) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			map.put(ch, 0);
		}
		String lowerString = string.toLowerCase();
		char[] chararray = lowerString.toCharArray();
		for (int i = 0; i < chararray.length; i++) {
			if (chararray[i] >= 'a' && chararray[i] <= 'z') {
				int val = map.get(chararray[i]);
				map.put(chararray[i], val + 1);
			}
		}
		int count = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (map.get(ch) == 0) {
				count++;
			}
		}
		return count == 0;
	}
}
