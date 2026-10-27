package com.example.URL.shortner.controller;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/addURL")
    public ResponseEntity<String> addUrl(@RequestBody URL url){
        try{
            String data = kafkaService.kafkaMessage(url);
            return new ResponseEntity<>(data,HttpStatus.CREATED);
        }
        catch(Exception e){
            throw new RuntimeException(e);
//            return new ResponseEntity<>("Try Again",HttpStatus.BAD_REQUEST);
        }
    }
}
