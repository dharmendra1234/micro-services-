package com.service.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.service.dao.OrderDao;
import com.service.entity.Order;
@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderDao orderDao;
    
    @GetMapping("/status/check")
    public String status() {
        return "Order service is up and running!!";
    }
    
	
    @GetMapping("/orders")
    public List<Order> getOrderList() {
    	return this.orderDao.list();
    	// return "Hello adasd";
    }
	 

    
}