package com.yongdu.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }


    @RestController
    class HelloworldController {

        @GetMapping("/")
        String hello(@RequestHeader(value = "User-Agent") String userAgent) {
            String result = String.format("Welcome to 2022! From user agent:  %s",userAgent);
            return result;
        }
    }
}
