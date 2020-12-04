/**
 * 
 */
package com.appexception;

/**
 * @author sunil
 *
 */
@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
