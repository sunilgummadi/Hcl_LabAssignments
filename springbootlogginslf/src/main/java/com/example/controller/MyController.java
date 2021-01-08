package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MyController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/uri/{param}")
	public String sayHello(@PathVariable("param") String var) {
	
		log.info("inside the say hello function in controller");
		return myService.sayHelloFromService(var);
	}
}
