/**
 * 
 */
package com.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.appexception.UserException;
import com.appexception.UserNotFoundException;
import com.model.User;
import com.service.UserService;
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
		System.out.println("--------Welcome to Registration page--------");
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		UserService service = new UserServiceImp();
		int id;
		String userName;
		String userPwd;
		while (true) {
			System.out.println(
					"1.Create User\n2.Read User with ID\n3.Read User with Name\n4.Update User\n5.Delete User with ID\n6.Delete User with Name\n7.Exit\nEnter your choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter user Id:");
				id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter user name:");
				userName = scanner.nextLine();
				System.out.println("Enter user password:");
				userPwd = scanner.nextLine();
				user = new User(id, userName, userPwd);
				try {
					service.createUser(user);
				} catch (UserException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the user id to get details:");
				id = scanner.nextInt();
				scanner.nextLine();
				try {
					user = service.getUserWithId(id);
					System.out.println(user.getUserId() + " , " + user.getUserName() + " , " + user.getPassword());
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter the user name to get details:");
				userName = scanner.nextLine();
				try {
					user = service.getUserWithName(userName);
					System.out.println(user.getUserId() + " , " + user.getUserName() + " , " + user.getPassword());
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Enter the id of the user you want to update :");
				id = scanner.nextInt();
				scanner.nextLine();
				try {
					// service.isValidID(id);
					System.out.println("Enter user updated name:");
					userName = scanner.nextLine();
					System.out.println("Enter user updated password:");
					userPwd = scanner.nextLine();
					user = new User(id, userName, userPwd);
					service.updateUser(user);
					System.out.println("User data updated successfully");
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Enter user id you want to delete :");
				id = scanner.nextInt();
				scanner.nextLine();
				try {
					service.deleteUserWithId(id);
					System.out.println("User successfully deleted :");
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Enter user name you want to delete :");
				userName = scanner.nextLine();
				try {
					service.deleteUserWithName(userName);
					System.out.println("User successfully deleted :");
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Please enter the valid input");
			}
		}
	}

}
