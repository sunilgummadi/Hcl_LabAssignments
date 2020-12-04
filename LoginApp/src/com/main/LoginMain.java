/**
 * 
 */
package com.main;

import java.util.Scanner;

import com.dao.UserDaoImp;
import com.exception.InvalidPasswordException;
import com.exception.InvalidUserException;
import com.service.UserServiceImp;

/**
 * @author sunil
 *
 */
public class LoginMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		UserDaoImp daoImp = new UserDaoImp();
		UserServiceImp userServiceImp = new UserServiceImp();

		try {
			System.out.println("Enter username :");
			username = scanner.nextLine();
			userServiceImp.isValidUser(username);
			System.out.println("Enter password :");
			password = scanner.nextLine();
			userServiceImp.isValidPassword(password);
			daoImp.createUser(username, password);
		} catch (InvalidUserException e) {
			System.err.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {

			System.err.println(e);
		} finally {
			scanner.close();
		}

	}

}
