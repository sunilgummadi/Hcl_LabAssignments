/**
 * 
 */
package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

/**
 * @author sunil
 *
 */
public class SpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/hasafile.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee.getName());
		System.out.println(employee.getId());
		System.out.println(employee.getAddress().getCity());
		applicationContext = null;

	}

}
