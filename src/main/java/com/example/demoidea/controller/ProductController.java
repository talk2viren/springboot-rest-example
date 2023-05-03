package com.example.demoidea.controller;

import com.example.demoidea.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping("books")
public class ProductController {

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        System.out.println("Test Point 2 : "+product.toString());
        return product;
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        products.forEach((a)-> System.out.println(a.toString()));
        return products;
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id){
        System.out.println("Product ID : "+id);
        return new Product();
    }

    @GetMapping("productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        System.out.println("Product By Name : "+name);
        return new Product();
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return "id";
    }

    @PostMapping(path = "/putrequesttest")
    public Product putRequestTest(@RequestBody Product product){
        System.out.println("Post Request : "+product.toString());
        return product;
    }

    @PatchMapping("/patchrequesttest")
    public Product patchRequestTest(@RequestBody Product product){
        System.out.println("Patch Request : "+product.toString());
        return product;
    }

    @PutMapping("/putrequestex")
    public Product putRequest(@RequestBody Product product){
        System.out.println("Put Request Example : "+product.toString());
        return product;
    }


}
