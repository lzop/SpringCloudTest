package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/25 11:53
 */
@RestController
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return mainService.hiService(name);
    }
}
