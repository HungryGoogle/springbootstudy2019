package com.example.registercenter5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Registercenter5Application {

    public static void main(String[] args) {
        SpringApplication.run(Registercenter5Application.class, args);
        System.out.println("hello");
    }

}

