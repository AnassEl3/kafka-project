package com.learning.kafkapublisher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaPublisherApplication {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        SpringApplication.run(KafkaPublisherApplication.class, args);
        logger.info("Kafka publisher running ....");
    }

}
