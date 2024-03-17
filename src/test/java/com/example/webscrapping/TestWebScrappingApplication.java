package com.example.webscrapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestWebScrappingApplication {

    public static void main(String[] args) {
        SpringApplication.from(WebScrappingApplication::main).with(TestWebScrappingApplication.class).run(args);
    }

}
