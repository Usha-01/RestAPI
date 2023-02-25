package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	@PostMapping ("/child")
	public String addChild (@RequestBody Child child)
	{
		return service.addChild(child);	
	}
	@GetMapping ("/child")
	public List<Child> read()
	{
		return service.getChild();
	}
	@GetMapping("/child/{field}")
	public List<Child> productWithSort(@PathVariable String field)
	{
		return service.getChildtSorted(field);
	}
	@GetMapping("/child/{offset}/{pageSize}")
	public List<Child> productWithPagination(@PathVariable int offset,@PathVariable int pageSize )
	{
	return service.getProductWithPagination(offset,pageSize);
	}
	@GetMapping("/child/{offset}/{pagesize}/{field}")

	public List<Child> getWithSortedPagination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){

	return service.getProductsWithPaginationAndSorting(offset, pagesize, field);

	}

}
