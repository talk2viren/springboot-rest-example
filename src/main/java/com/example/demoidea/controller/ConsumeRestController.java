package com.example.demoidea.controller;

import com.example.demoidea.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/org")
public class ConsumeRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getEmployee/{name}")
    public String getAPIResponse(@PathVariable String name) {
        return productService.callService();
    }
}
