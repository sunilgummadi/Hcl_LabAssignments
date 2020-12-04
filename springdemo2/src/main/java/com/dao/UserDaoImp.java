/**
 * 
 */
package com.dao;

import org.springframework.stereotype.Repository;

/**
 * @author sunil
 *
 */
@Repository
public class UserDaoImp implements UserDao {

	@Override
	public String userMsg(String userName, String pswd) {
		if(userName.equals("sunil") && pswd.equals("kumar"))
			return "welcome Sunil";
		return null;
	}

}
