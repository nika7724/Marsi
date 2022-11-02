package com.example.marsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class MarsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsiApplication.class, args);
    }

}
