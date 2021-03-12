package com.example.userserice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UsersericeApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersericeApplication.class, args);
    }

}
