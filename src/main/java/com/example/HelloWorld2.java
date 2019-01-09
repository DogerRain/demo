package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld2 {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    String home1() {
        return "Hello World! Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld2.class, args);
    }
}
