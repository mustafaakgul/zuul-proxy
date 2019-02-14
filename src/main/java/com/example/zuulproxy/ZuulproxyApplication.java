package com.example.zuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulproxyApplication.class, args);
    }

}

