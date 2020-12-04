package com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunil
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeePhNo;
	public void doMyStartUpStuff() {
		System.out.println("Init mehtod after properties are set :");
		System.out.println("Employee Name from init method :"+employeeName);
	}
	public void doMyCleaning(){
	 System.out.println("Spring container is distroyed");	
	}
	public void defaultInint() {
		System.out.println("From default inint method ");
		System.out.println("from default init :"+employeeName);
	}
	public void defaultDestroy() {
		System.out.println("From default destroy method ");
	}
}
