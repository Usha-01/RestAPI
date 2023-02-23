package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService service;
	
	@PostMapping ("/employee")
	public boolean addEmployee(@RequestBody Employee employee)
	{
		return service.addEmployee(employee);
	}
	@GetMapping("/employee")
	public List<Employee> read()
	{
		return service.getEmployee();
	}

}