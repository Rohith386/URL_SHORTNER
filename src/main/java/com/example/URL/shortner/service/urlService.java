package com.example.URL.shortner.service;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.repository.urlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.util.ExceptionUtil;

import java.util.List;

@Service
public class urlService {

    @Autowired
    urlRepo urp;
    public String shortURL(String url){

        try{
            URL us=urp.findByLongUrl(url);
            return us.getShortUrl();
        }
        catch(Exception e){
            return "Not Found";
        }
    }

    public List<URL> allUrl(){
        return urp.findAll();
    }
}

