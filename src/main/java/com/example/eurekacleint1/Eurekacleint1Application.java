package com.example.eurekacleint1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient //eureka, consul, zookeeper의 implements를 모두 포함. @EnableEurekaClient는 only works for eureka.
@SpringBootApplication
public class Eurekacleint1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekacleint1Application.class, args);
    }

}
