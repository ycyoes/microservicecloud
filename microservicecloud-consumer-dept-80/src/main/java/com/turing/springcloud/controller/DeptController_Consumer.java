package com.turing.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.turing.springcloud.entities.Dept;

@RestController
@RequestMapping(value = "/consumer/dept/")
public class DeptController_Consumer {
	
	private static final String REST_URL_PREFIX = "http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value = "get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
}
