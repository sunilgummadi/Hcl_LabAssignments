package com.pojo;

public class CountVowels {
	public static int count(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				count++;
		}
		return count;
	}
}
