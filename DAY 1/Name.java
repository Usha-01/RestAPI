package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Name {

	private String studname="IamNeo";
	@RequestMapping("/name")
	public String name()
	{
		return "Welcome "+studname;
	}
	
}
