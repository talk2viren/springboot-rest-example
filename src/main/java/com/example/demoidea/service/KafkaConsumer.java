package com.example.demoidea.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class KafkaConsumer {

//    @Value("${message.topic.name}")
//    private String TOPIC ;
//
//    @Value("${message.topic.name}")
//    private String TOPIC ;

    @Value("${monitor.kafka.consumer.group.id}")
    public String groupId;

    public final List<String> message = new ArrayList<>();


//    @KafkaListener(topics = TOPIC,groupId =groupId)
    @KafkaListener(topics = "quickstart-events",groupId ="baeldungGrp")
    public void receive(ConsumerRecord<String,String> consumerRecord){
        log.info("Received record : {}",consumerRecord.toString());
        message.add(consumerRecord.value());
    }

}
