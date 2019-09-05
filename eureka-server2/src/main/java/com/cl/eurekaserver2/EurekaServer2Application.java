package com.cl.eurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServer2Application {

   public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }

}
