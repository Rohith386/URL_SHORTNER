package com.example.URL.shortner.controller;

import com.example.URL.shortner.service.shortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/ShortUrl")
public class shortUrlController {

    @Autowired
    shortUrlService srs;

    @PostMapping("/generateShortUrl")
    public Optional shortUrl(String url){
        return srs.generateShort(url),;
    }
}
