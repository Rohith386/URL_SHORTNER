package com.example.URL.shortner.repository;

import com.example.URL.shortner.Entity.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface urlRepo extends JpaRepository<URL, Long > {
    URL findByLongUrl(String url);
}


