package com.example.eurekaclient01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //注册为客户端
@RestController //确定为一个controller
public class EurekaClient01Application {
    private static Logger logger = LoggerFactory.getLogger(EurekaClient01Application.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient01Application.class, args);
        logger.info("Client01 start......");
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        logger.info("name:{}", name);
        return "hi " + name + ",i am from port:" + port;
    }

}
