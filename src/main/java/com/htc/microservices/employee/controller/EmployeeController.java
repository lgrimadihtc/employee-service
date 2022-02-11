package com.htc.microservices.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.microservices.employee.entities.Employee;
import com.htc.microservices.employee.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	
	@GetMapping("/employees")
	public List<Employee> findAll(){ return this.service.findAll();

	}

}
