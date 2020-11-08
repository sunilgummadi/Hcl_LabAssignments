package com.pojo;

public class MiddleCharacter {
	public static String findMiddle(String string) {
		int len = string.length();
		if (isOdd(len)) {
			return string.substring(len / 2, (len / 2) + 1);
		} else {
			return string.substring((len / 2) - 1, (len / 2) + 1);
		}
	}

	public static boolean isOdd(int num) {
		return num % 2 == 1;
	}
}
