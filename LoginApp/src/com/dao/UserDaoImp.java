/**
 * 
 */
package com.dao;

import java.util.HashMap;
import java.util.Map;

import com.exception.InvalidUserException;

/**
 * @author sunil
 *
 */
public class UserDaoImp implements UserDao {
	private Map<String, String> loginDB = new HashMap<String, String>();

	// for understanding purpose I will be adding hardcode users and their passwords
	public  void creatingDB() {
		this.loginDB.put("sunil", "12345678");
		this.loginDB.put("kumar", "sunil123");
	}
	@Override
	public void createUser(String name, String pswd) {
		this.loginDB.put(name, pswd);
	}

	@Override
	public Map<String, String> getUsers() {
		return this.loginDB;
	}
	@Override
	public void isValidUser(String name) throws InvalidUserException {
		new UserDaoImp().creatingDB();
		Map<String,String> loginDB = new UserDaoImp().getUsers();
		for (Map.Entry<String, String> user :loginDB.entrySet()) {
			if (user.getKey().equals(name)) {
				throw new InvalidUserException("User already present in the database try another user name");
			}
		}

	}

}
