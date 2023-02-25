package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepo;

;

@Service
public class ApiService {
	@Autowired
	ChildRepo repository; 

	public String addChild(Child child) {
		// TODO Auto-generated method stub
		repository.save(child);
		return "Added";
	}

	public List<Child> getChild() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}
	//SORTING
	public List<Child> getChildtSorted(String field) {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	//PAGINATION
	public List<Child> getProductWithPagination(int offset, int pageSize) {
		// TODO Auto-generated method stub
		Page<Child> page=repository.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
		
	}
	//SORTING AND PAGINATION
	public List<Child> getProductsWithPaginationAndSorting(int offset, int pageSize,String field)
	{
		Pageable paging = PageRequest.of(offset, pageSize,Sort.by(field));
		Page<Child> page=repository.findAll(paging);
		return page.getContent();
	}

}
