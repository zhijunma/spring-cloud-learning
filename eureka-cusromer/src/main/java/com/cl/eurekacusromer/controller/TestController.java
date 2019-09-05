package com.cl.eurekacusromer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "test01Fail")
    @GetMapping("/hello")
    public String getHome() {

        String data = restTemplate.getForObject("http://service-zuul/hello?token=1", String.class);

        return data;

    }
    public String test01Fail(){
        return "Connect server provider fail";
    }

}