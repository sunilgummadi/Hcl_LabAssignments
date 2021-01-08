/**
 * 
 */
package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

/**
 * @author sunil
 *
 */
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
