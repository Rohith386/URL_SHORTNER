package com.example.URL.shortner.service;

import com.razorpay.RazorpayClient;
import lombok.Value;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentService {


    @Value("${razorpay.api.key}")
    private String razorpay_key;

    @Value("${razorpay.api.secret}")
    private String razorpay_secret;

    RazorpayClient client;


    public String createOrder(int amount,String currency,long utr){
        client = new RazorpayClient(razorpay_key,razorpay_secret);
        JSONObject obj = new JSONObject();
        obj.put("Amount",amount*100);
        obj.put("Currency",currency);
        obj.put("UTR",3294824233932);
        Object newOrder = client.orders.create(obj);
        return newOrder.toString();
    }


}
