/**
 * 
 */
package com.service;


import java.util.Map;

import com.dao.UserDaoImp;
import com.exception.InvalidPasswordException;
import com.exception.InvalidUserException;

/**
 * @author sunil
 *
 */
public class UserServiceImp implements UserService {

	@Override
	public void isValidUser(String name) throws InvalidUserException {
		new UserDaoImp().isValidUser(name);
//		Map<String,String> loginDB = new UserDaoImp().getUsers();
//		for (Map.Entry<String, String> user :loginDB.entrySet()) {
//			if (user.getKey().equals(name)) {
//				throw new InvalidUserException("User already present in the database try another user name");
//			}
//		}

	}

	@Override
	public void isValidPassword(String paswd) throws InvalidPasswordException {
		if (paswd.length() < 8) {
			throw new InvalidPasswordException("Minimum Password length should be 8");
		}
	}

}
