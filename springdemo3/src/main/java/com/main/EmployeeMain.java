package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

/**
 * @author sunil
 *
 */
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println("from main method :"+employee.getEmployeeId());
		System.out.println("from main method :"+employee.getEmployeePhNo());
		System.out.println("employee1 details :");
		Employee employee1 = applicationContext.getBean("employee1",Employee.class);
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getEmployeePhNo());
		
		employee = null;
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
