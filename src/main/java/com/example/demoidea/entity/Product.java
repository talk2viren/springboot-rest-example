package com.example.demoidea.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;


}
