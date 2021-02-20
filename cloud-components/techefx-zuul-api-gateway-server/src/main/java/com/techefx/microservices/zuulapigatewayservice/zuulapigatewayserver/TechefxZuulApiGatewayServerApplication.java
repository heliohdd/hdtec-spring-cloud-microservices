package com.techefx.microservices.zuulapigatewayservice.zuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class TechefxZuulApiGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechefxZuulApiGatewayServerApplication.class, args);
    }

}
