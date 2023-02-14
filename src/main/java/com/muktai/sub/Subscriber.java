package com.muktai.sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.muktai.model.Product;
import com.muktai.service.ProductService;

@Component
public class Subscriber 
{
	private Logger logger=LoggerFactory.getLogger(Subscriber.class);
	
	@Autowired
	private ProductService service;
	
	@KafkaListener(topics ="${my.kafka.topic.name}",groupId ="${spring.kafka.consumer.group-id}")
	public void receiveString(Product p)
	{
		logger.info("Product: {}",p);
		service.savePro(p);
	}
}
