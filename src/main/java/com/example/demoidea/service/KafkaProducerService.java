package com.example.demoidea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${message.topic.name}")
    private String topicName;


    public String callService(String id) {

        String url = "https://jsonplaceholder.typicode.com/todos/" + id;

        String results = restTemplate.getForObject(url, String.class);

        System.out.println(results);


        return results;
    }


    public void sendKafkaMessage(String message) {
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent Message =[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
            }
        });

    }

    public static void main(String[] args) {

//        RestTemplate restTemplate1=new RestTemplate();
//        String url = "https://jsonplaceholder.typicode.com/todos";
//
//        String results=restTemplate1.getForObject(url,String.class);
//
//        System.out.println(results);


    }

}
