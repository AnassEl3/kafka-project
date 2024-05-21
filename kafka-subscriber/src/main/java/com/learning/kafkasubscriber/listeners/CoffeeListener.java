package com.learning.kafkasubscriber.listeners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CoffeeListener {
    @Value("${spring.kafka.template.default-topic}")
    private String topicName;
    @KafkaListener(topics = "coffee-shop", groupId = "coffee-consumers")
    public void coffeeListener(String data){
        System.out.println("New coffee: " + data);
    }

}
