package com.exception;

/**
 * 
 * @author sunil
 *
 */
@SuppressWarnings("serial")
public class InvalidUserException extends Exception {
	public InvalidUserException(String msg) {
		super(msg);
	}
}
