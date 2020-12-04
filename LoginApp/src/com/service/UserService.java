/**
 * 
 */
package com.service;


import com.exception.InvalidPasswordException;
import com.exception.InvalidUserException;

/**
 * @author sunil
 *
 */
public interface UserService {
	
	public void isValidUser(String name) throws InvalidUserException;

	public void isValidPassword(String paswd) throws InvalidPasswordException;
	
}
