/**
 * 
 */
package com.example.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Employee;

/**
 * @author sunil
 *
 */
@Service
public class ConsumerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String dataFromAnotherService() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
		return restTemplate.exchange("http://localhost:8080/producerUri",HttpMethod.GET, entity, String.class).getBody();
	}
	
	public Employee getEmployeeDetails(int val) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
		Employee employee = restTemplate.getForObject("http://localhost:8080/fetch/"+val, Employee.class);
		return employee;
	}
}
