package com.muktai.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.muktai.model.Product;
import com.muktai.repo.ProductRepository;
@Component
public class ProductService
{
	private Logger logger=LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository repo;
	
	public void savePro(Product p) 
	{
		repo.save(p);
		logger.info("product saved....", p);
	}
	
	public List<Product> geAll()
	{
		return repo.findAll();
	}
}
