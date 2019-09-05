package com.cl.eurekaserver2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server2Controller {

    @Value("${server.port}")
    String name;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(String name){
        return "server-2 say hello"+name;
    }
}
