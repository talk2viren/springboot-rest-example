package com.example.demoidea.controller;

import com.example.demoidea.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/org")
public class ConsumeRestController {

    @Autowired
    private KafkaProducerService productService;

//    Search by id
    @GetMapping("/getEmployee/{id}")
    public String getAPIResponse(@PathVariable String id) {
        return productService.callService(id);
    }


    @GetMapping("/sendKafka")
    public String sendKafkaMessage(){

        productService.sendKafkaMessage("Test Kafka Message");

        return "Success";
    }

    @GetMapping("/createTopic")
    public String getName(){
        return "Topic created - Success";
    }


}
