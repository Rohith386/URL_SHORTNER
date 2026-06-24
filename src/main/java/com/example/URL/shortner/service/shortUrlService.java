package com.example.URL.shortner.service;

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
            String URL = generateShortUrl(url);
            return new ResponseEntity<>(URL, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }
}
