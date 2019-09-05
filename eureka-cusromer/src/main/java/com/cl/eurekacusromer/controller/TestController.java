package com.cl.eurekacusromer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/hello")
    public String getHome() {

        String data = restTemplate.getForObject("http://server-1/hello", String.class);

        return data;

    }

}