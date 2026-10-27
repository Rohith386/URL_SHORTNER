package com.example.URL.shortner.service;

import com.example.URL.shortner.Entity.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String, URL> kafkaTemplate;

    public String kafkaMessage(URL url){
        kafkaTemplate.send("demo-topic","partition-1",url);
        return "Data sent to kafka, Successfully";
    }
}

