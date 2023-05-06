package com.example.demoidea.common;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

public class KafkaProducer {

//    public ProducerFactory<String, String> producerFactory() {
//        Map<String, Object> configProps = new HashMap<>();
//        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "${spring.kafka.producer.bootstrap-servers}");
//        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "${spring.kafka.producer.key-serializer}");
//        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "${spring.kafka.producer.value-serializer}");
//        configProps.put(ProducerConfig.CLIENT_ID_CONFIG, "${spring.kafka.producer.client-id}");
//        configProps.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "${spring.kafka.producer.security.protocol}");
//        configProps.put(SaslConfigs.SASL_MECHANISM, "${spring.kafka.producer.sasl.mechanism}");
//        configProps.put(SaslConfigs.SASL_JAAS_CONFIG, "${spring.kafka.producer.sasl.jaas.config}");
//
//        return new DefaultKafkaProducerFactory<>(configProps);
//    }

//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("<your-kafka-topic>", message);
    }






}
