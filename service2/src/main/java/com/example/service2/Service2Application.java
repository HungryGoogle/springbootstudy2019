package com.example.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Service2Application {


    //跳转到上传文件的页面
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        System.out.println("http hello, return hello_result");
        return "hello_result";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }

}

