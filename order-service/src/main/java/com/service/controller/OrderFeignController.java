package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.dao.ProductServiceProxy;

@RestController
@RequestMapping(value="/feign/client")
public class OrderFeignController {
	
	@Autowired
	ProductServiceProxy productServiceProxy;
	
	@GetMapping
	public String hello() {
		
		String response = productServiceProxy.status();
		return "Feign client called =>" +response ;
	}

}
	