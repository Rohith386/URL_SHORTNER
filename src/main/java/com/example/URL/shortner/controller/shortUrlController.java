package com.example.URL.shortner.controller;

import com.example.URL.shortner.service.shortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ShortUrl")
public class shortUrlController {

    @Autowired
    shortUrlService srs;

    @PostMapping("/generateShortUrl")
    public ResponseEntity<String> shortUrl(@RequestParam String url){
        return srs.generateShort(url);
    }
}
