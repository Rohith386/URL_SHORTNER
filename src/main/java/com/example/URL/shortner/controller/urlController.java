package com.example.URL.shortner.controller;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.service.urlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/URL")
public class urlController {

    @Autowired
    urlService us;

    @GetMapping("/getURL")
    public String getShortURL(@RequestParam String url) {
        String ur=us.shortURL(url);
        if(ur.equals("Not Found")){
            return "URL not found";
        }
        return ur;

    }

    @GetMapping("/AllURL")
    public List<URL> getAllUrl(){
        return us.allUrl();
    }

}
