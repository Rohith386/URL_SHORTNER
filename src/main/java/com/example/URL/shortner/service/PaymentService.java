package com.example.URL.shortner.service;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Value("${razorpay.api.key}")
    private String razorpayKey;

    @Value("${razorpay.api.secret}")
    private String razorpaySecret;

    public String createOrder(int amount, String currency)
            throws RazorpayException {

        RazorpayClient client =
                new RazorpayClient(razorpayKey, razorpaySecret);

        JSONObject obj = new JSONObject();
        obj.put("amount", amount * 100);
        obj.put("currency", currency);
        obj.put("receipt", "receipt_" + System.currentTimeMillis());

        return client.orders.create(obj).toString();
    }
}

