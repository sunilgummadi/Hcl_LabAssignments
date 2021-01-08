package com.example.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;


/**
 * @author sunil
 *
 */
@Service
@Slf4j
public class MyService {

	public String sayHelloFromService(String var) {
		log.info("valid message"+var);
		return "welcome to logging";
	}
}
