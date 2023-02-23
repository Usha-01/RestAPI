package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo repository;
	public boolean addEmployee (Employee employee)
	{
		repository.save(employee);
		return true;
	}
	public List<Employee> getEmployee ()
	{
		return repository.findAll();
	}

}
