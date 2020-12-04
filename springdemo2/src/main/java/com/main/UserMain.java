package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

/**
 * @author sunil
 *
 */
public class UserMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scanner.nextLine();
		System.out.println("Enter password:");
		String pswd = scanner.nextLine();
		UserService obj = applicationContext.getBean("userService",UserService.class);
		System.out.println(obj.userMsg(name, pswd));
		scanner.close();
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
