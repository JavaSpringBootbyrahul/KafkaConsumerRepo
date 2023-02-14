package com.muktai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muktai.model.Product;
import com.muktai.service.ProductService;

@RestController
public class ConsumerController 
{
	@Autowired
	private ProductService serv;
	
	@GetMapping("/all")
	public List<Product> getAll()
	{
		return serv.geAll();
	}
}
