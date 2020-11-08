package com.pojo;

public class LongestString {
	public static String getLargestWord(String string) {
		String[] strings = string.split(" ");
		int max = 0;
		String requiredString = "";
		for (String str : strings) {
			int len = str.length();
			if (max < len) {
				max = len;
				requiredString = str;
			}
		}
		return requiredString;
	}
}
