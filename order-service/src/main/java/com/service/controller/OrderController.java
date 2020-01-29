package com.service.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/order")
public class OrderController {
    
    @GetMapping("/status/check")
    public String status() {
        return "Order service is up and running!!";
    }
}