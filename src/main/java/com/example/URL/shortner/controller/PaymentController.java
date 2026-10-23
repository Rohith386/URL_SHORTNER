package com.example.URL.shortner.controller;

import com.example.URL.shortner.service.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/createOrder")
    public String createOrder(
            @RequestParam int amount,
            @RequestParam String currency
    ) throws RazorpayException {

        return paymentService.createOrder(amount, currency);
    }
}