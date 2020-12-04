/**
 * 
 */
package com.exception;

/**
 * @author sunil
 *
 */
@SuppressWarnings("serial")
public class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}
