package com.example.demoidea.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class MyProducts {

    public ArrayList<Product> getProductList(){
        ArrayList<Product> myProducts=new ArrayList<>();
        for(int i=0;i<10;i++){
            myProducts.add(new Product(i,"Name_"+i,i*10,i*100));
        }
        return myProducts;
    }
}
