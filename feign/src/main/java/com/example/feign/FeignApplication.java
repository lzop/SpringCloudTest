package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/25 15:00
 */
@SpringBootApplication
@EnableEurekaClient //向服务中心进行注册
@EnableFeignClients  //feign消费服务
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class);
    }
}
