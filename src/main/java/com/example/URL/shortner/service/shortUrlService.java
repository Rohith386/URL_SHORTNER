package com.example.URL.shortner.service;

import com.example.URL.shortner.Entity.URL;
import com.example.URL.shortner.repository.urlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tools.jackson.databind.node.StringNode;

import java.util.Random;

@Service
public class shortUrlService {

    @Autowired
    urlRepo ur;
    public ResponseEntity<String> generateShort(String url){

        try{
            String shortURL = generateShortUrl(url);
            System.out.println(url);
            System.out.println(shortURL);
            ur.save(new URL(url,shortURL));
            return new ResponseEntity<>(shortURL, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }

    private String generateShortUrl(String url){

        StringBuilder sb = new StringBuilder();
        sb.append("http://");

        String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random rand = new Random();

        for(int i=0;i<8;i++){
            int val = rand.nextInt(str.length()-1);
            sb.append(str.charAt(val));
        }

        sb.append(".shortURL");

        return sb.toString();
    }
}
