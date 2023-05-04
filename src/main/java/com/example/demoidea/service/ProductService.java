package com.example.demoidea.service;

import com.example.demoidea.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    public String callService(){

        String url = "https://jsonplaceholder.typicode.com/todos";

        String results=restTemplate.getForObject(url,String.class);

        System.out.println(results);


        return results;
    }

}
