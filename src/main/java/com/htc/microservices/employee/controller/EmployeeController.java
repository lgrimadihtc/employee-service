package com.htc.microservices.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htc.microservices.employee.entities.Employee;
import com.htc.microservices.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return this.service.findAll();

	}

	@PostMapping("/employees")
	public Employee save(@Valid @RequestBody Employee employee) {
		return this.service.save(employee);
	}

	@PutMapping("/employees/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable("id") Integer id) {
		employee.setId(id);
		return this.service.update(employee);
	}

	@GetMapping("/employees/{id}")
	public Employee update(@PathVariable("id") Integer id) {
		return this.service.findById(id);
		
	}

	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable("id") Integer id) {
		this.service.deleteById(id);
	}

}
