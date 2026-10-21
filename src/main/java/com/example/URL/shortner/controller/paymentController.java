package com.example.URL.shortner.controller;

import com.example.URL.shortner.service.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class paymentController {

    @Autowired
    paymentService ps;

    @PostMapping("/payements")
    public String createOrder(int amount,String currency,long id){
        try{
            return ps.createOrder(amount,currency,id);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
