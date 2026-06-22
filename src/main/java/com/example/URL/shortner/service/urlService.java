package com.example.URL.shortner.service;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.repository.urlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tools.jackson.databind.util.ExceptionUtil;

@Service
public class urlService {

    @Autowired
    urlRepo urp;
    public URL shortURL(String url){

        try{
            URL us=urp.findByLongUrl(url);
            return us;
        }
        catch(Exception e){
            return null;
        }
    }
}

