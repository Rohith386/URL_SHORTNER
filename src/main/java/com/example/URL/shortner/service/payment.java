package com.example.URL.shortner.service;

import com.razorpay.RazorpayClient;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {


    @Value("${razorpay.api.key}")
    private String razorpay_key;

    @Value("${razorpay.api.secret}")
    private String razorpay_secret;

    @Autowired
    RazorpayClient client;



}
