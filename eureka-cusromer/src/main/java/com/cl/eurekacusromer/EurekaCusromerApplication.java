package com.cl.eurekacusromer;

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.loadbalancer.LoadBalanced;
        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
        import org.springframework.context.annotation.Bean;
        import org.springframework.web.client.RestTemplate;

        import com.netflix.loadbalancer.IRule;
        import com.netflix.loadbalancer.RandomRule;

@SpringBootApplication
@EnableEurekaClient

public class EurekaCusromerApplication {

    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }


    @Bean
    public IRule ribbonRule() {
        return new RandomRule(); //随机负载均衡策略,如未向容器中注入，默认是轮询方式
    }



    public static void main(String[] args) {
        SpringApplication.run(EurekaCusromerApplication.class, args);
    }
}