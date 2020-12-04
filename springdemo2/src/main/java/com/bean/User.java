/**
 * 
 */
package com.bean;

import org.springframework.stereotype.Component;

/**
 * @author sunil
 *
 */
@Component
public class User {
	private String name;
	private String pswd;

	/*
	 * @Autowired private UserService userService;
	 */
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	/*
	 * public String userMsg(String name2, String pswd2) { return
	 * userService.userMsg(name2, pswd2); }
	 */
	
	
}
