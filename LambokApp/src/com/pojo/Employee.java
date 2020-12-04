/**
 * 
 */
package com.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sunil
 *
 */
@Data
//@Getter
//@Setter
//@AllArgsConstructor(access=AccessLevel.PROTECTED)
//@ToString
public class Employee {
	@NonNull
	private int empId;
	@NonNull
	private String empName;
	@NonNull
	private double empSalary;
}
