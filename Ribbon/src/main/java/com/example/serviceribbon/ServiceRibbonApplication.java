package com.example.serviceribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //注册
@EnableHystrix
public class ServiceRibbonApplication {

    private static Logger logger = LoggerFactory.getLogger(ServiceRibbonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
        //启动负载均衡
    RestTemplate restTemplate() {
    	logger.info("开启轮询模式！！！");
        return new RestTemplate();
    }

}
