/**
 * 
 */
package com.dao;

import java.sql.SQLException;

import com.appexception.UserException;
import com.appexception.UserNotFoundException;
import com.model.User;

/**
 * @author sunil
 *
 */
public interface UserDao {
	public boolean createUser(User user) throws ClassNotFoundException, SQLException, UserException;

	public User getUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException;

	public User getUserWithName(String name) throws UserNotFoundException, ClassNotFoundException, SQLException;

	public boolean updateUser(User user) throws UserNotFoundException, ClassNotFoundException, SQLException;

	public boolean deleteUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException;

	public boolean deleteUserWithName(String name) throws UserNotFoundException, ClassNotFoundException, SQLException;

}
