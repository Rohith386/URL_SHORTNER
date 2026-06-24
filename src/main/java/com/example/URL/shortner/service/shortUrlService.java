package com.example.URL.shortner.service;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.repository.urlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class shortUrlService {

    @Autowired
    urlRepo ur;
    public ResponseEntity<String> generateShort(String url){

        try{
            String shortURL = generateShortUrl(url);
            ur.save(new URL(url,shortURL));
            return new ResponseEntity<>(shortURL, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }

    private String generateShortUrl(String url){

    }
}
