/**
 * 
 */
package com.service;

import java.sql.SQLException;

import com.appexception.UserException;
import com.appexception.UserNotFoundException;
import com.dao.UserDao;
import com.dao.UserDaoImp;
import com.model.User;

/**
 * @author sunil
 *
 */
public class UserServiceImp implements UserService {

	@Override
	public boolean createUser(User user) throws ClassNotFoundException, SQLException, UserException {
		UserDao userDao = new UserDaoImp();
		userDao.createUser(user);
		return true;
	}

	@Override
	public User getUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException {
		UserDao userDao = new UserDaoImp();
		User user = userDao.getUserWithId(id);
		return user;
	}

	@Override
	public User getUserWithName(String name) throws UserNotFoundException, ClassNotFoundException, SQLException {
		UserDao userDao = new UserDaoImp();
		User user = userDao.getUserWithName(name);
		return user;
	}

	@Override
	public boolean updateUser(User user) throws ClassNotFoundException, SQLException, UserNotFoundException {
		UserDao userDao = new UserDaoImp();
		userDao.updateUser(user);
		return true;
	}

	@Override
	public boolean deleteUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException {
		UserDao userDao = new UserDaoImp();
		userDao.deleteUserWithId(id);
		return true;
	}

	@Override
	public boolean deleteUserWithName(String name) throws UserNotFoundException, ClassNotFoundException, SQLException {
		UserDao userDao = new UserDaoImp();
		userDao.deleteUserWithName(name);
		return true;
	}

	@Override
	public boolean isValidID(int id) throws UserNotFoundException {
		return false;
	}

}
