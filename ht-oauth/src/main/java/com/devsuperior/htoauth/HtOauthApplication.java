package com.devsuperior.htoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HtOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtOauthApplication.class, args);
    }

}
