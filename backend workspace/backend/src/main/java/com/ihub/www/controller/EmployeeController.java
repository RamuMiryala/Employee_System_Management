package com.ihub.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihub.www.model.Employee;
import com.ihub.www.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	//dependency Injection
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
}
