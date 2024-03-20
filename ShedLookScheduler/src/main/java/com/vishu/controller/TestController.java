package com.vishu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishu.repo.EmployeeRepo;

@RestController
public class TestController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping("/getAllEmployee")
	public String getAllEmployee() {
		return employeeRepo.findAll().toString();
	}
	

}
