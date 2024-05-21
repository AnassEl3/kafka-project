package com.learning.kafkasubscriber.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CoffeeListener {
    private final Logger logger = LogManager.getLogger();
    @KafkaListener(topics = "coffee-shop", groupId = "coffee-consumers")
    public void coffeeListener(String data){
        logger.info("New coffee: " + data);
    }

}
