package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Color {
	private String color="peach";
	@RequestMapping("/color")
	public String name()
	{
		return "Hello i am "+color;
	}
}
