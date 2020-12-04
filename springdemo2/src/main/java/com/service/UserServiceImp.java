/**
 * 
 */
package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;

/**
 * @author sunil
 *
 */
@Service("userService")
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public String userMsg(String name, String pswd) {
		
		return userDao.userMsg(name, pswd);
	}

}
