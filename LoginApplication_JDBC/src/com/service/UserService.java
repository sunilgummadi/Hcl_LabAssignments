/**
 * 
 */
package com.service;

import java.sql.SQLException;

import com.appexception.UserException;
import com.appexception.UserNotFoundException;
import com.model.User;

/**
 * @author sunil
 *
 */
public interface UserService {
	public boolean createUser(User user) throws UserException,ClassNotFoundException, SQLException;

	public User getUserWithId(int id) throws UserNotFoundException,ClassNotFoundException, SQLException;

	public User getUserWithName(String name) throws UserNotFoundException,ClassNotFoundException, SQLException;
	
	public boolean isValidID(int id) throws UserNotFoundException,ClassNotFoundException, SQLException;
	
	public boolean updateUser(User user) throws UserNotFoundException,ClassNotFoundException, SQLException;

	public boolean deleteUserWithId(int id) throws UserNotFoundException,ClassNotFoundException, SQLException;

	public boolean deleteUserWithName(String name) throws UserNotFoundException,ClassNotFoundException, SQLException;

}
