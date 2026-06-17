package com.example.URL.shortner.service;

import com.example.URL.shortner.repository.urlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.util.ExceptionUtil;

@Service
public class urlService {

    @Autowired
    urlRepo urp;
    public String shortURL(String url){

        try{
            String str=urp.findBylongURL(url);
        }
        catch(Exception e){
            return "Error";
        }
    }
}
