package com.service.product.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @GetMapping("/status/check")
    public String status() {
        return "Product Service is up and runnng!!";
    }
}

