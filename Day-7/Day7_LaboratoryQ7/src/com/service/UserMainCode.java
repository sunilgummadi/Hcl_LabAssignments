/**
 * 
 */
package com.service;

/**
 * @author sunil
 *
 */
public class UserMainCode {
	public static int checkCharacters(String string) {
		int len = string.length();
		if (string.charAt(0) == (string.charAt(len - 1))) {
			return 1;
		}
		return -1;
	}
}
