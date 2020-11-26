package com.example.servicezuul;

import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/26 15:34
 */
@SpringBootApplication
@EnableZuulProxy  //开启zuul
@EnableEurekaClient //注册为客户端
public class ServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class);
    }
}
