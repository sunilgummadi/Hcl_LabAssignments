package com.pojo;

public class Palindrome {
	public static boolean isPalindrom(String string) {
		StringBuffer buffer = new StringBuffer(string);
		buffer.reverse();
		String reverse = buffer.toString();
		return string.equals(reverse);
	}
}
