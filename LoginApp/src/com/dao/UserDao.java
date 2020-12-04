/**
 * 
 */
package com.dao;

import java.util.Map;

import com.exception.InvalidUserException;


/**
 * @author sunil
 *
 */
public interface UserDao {
	public void createUser(String name, String Pswd);

	public Map<String, String> getUsers();
	public void isValidUser(String name) throws InvalidUserException;
}