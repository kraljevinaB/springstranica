package com.example.springstranica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.example.springstranica.entity")
public class SpringstranicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringstranicaApplication.class, args);
    }

}
