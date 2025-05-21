package com.exemplo.patio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PatioApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatioApplication.class, args);
    }
}