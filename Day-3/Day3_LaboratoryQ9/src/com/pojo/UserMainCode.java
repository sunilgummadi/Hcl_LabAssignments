package com.pojo;

public class UserMainCode {
	public static String reshape(String string, char ch) {
		int len = string.length();
		StringBuffer bufferString = new StringBuffer(len);
		bufferString.append(string);
		bufferString.reverse();
		StringBuffer modifiedString = new StringBuffer(2 * len - 1);
		modifiedString.append(bufferString.charAt(0));
		for (int i = 1; i < len; i++) {
			modifiedString.append('-');
			modifiedString.append(bufferString.charAt(i));
		}
		return new String(modifiedString);
	}
}
