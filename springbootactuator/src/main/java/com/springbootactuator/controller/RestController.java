/**
 * 
 */
package com.springbootactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sunil
 *
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("welcome")
	public String sayHello() {
		return "Welcome to actuator";
	}
}
