package com.example.URL.shortner.controller;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.service.urlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/URL")
public class urlController {

    @Autowired
    urlService us;

    @GetMapping("/getURL")
    public String getShortURL(@RequestParam String url) {
        URL ur=us.shortURL(url);
        if(ur==null){
            return "URL not found";
        }
        String shorturl = ur.getShortUrl();
        return shorturl;

    }

}
