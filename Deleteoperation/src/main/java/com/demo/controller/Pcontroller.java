package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.repository.Prepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Pcontroller
{

	@Autowired
	private Prepository prepo;
	
	@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/deleterecord")
	public void deletedemo(@RequestBody Product p)
	{
		this.prepo.delete(p);
	}
	
}
