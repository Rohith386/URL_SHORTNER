package com.example.URL.shortner.controller;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.service.urlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/URL")
public class urlController {

    @Autowired
    urlService us;

    @GetMapping("/getURL/{url}")
    public String getShortURL(String url) {
        URL ur=us.shortURL(url);
        if(ur==null){
            return "URL not found";
        }
        String shorturl = ur.getShortURL();
        return shorturl;

    }

}
