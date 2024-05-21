package com.learning.kafkapublisher.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coffee")
public class CoffeeShopController {
    @Value("${spring.kafka.template.default-topic}")
    private String topicName;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public CoffeeShopController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    private void publish(@RequestBody String body){
        kafkaTemplate.send(topicName, body);
    }
}
