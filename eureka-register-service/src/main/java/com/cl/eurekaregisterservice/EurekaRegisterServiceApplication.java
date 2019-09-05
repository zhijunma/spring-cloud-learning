package com.cl.eurekaregisterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterServiceApplication.class, args);
    }

}
