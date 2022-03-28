package com.example.gladiator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class GladiatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GladiatorApplication.class, args);
    }

}
