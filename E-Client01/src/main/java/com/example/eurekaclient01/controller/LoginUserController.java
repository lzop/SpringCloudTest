package com.example.eurekaclient01.controller;

import com.example.eurekaclient01.entity.LoginUser;
import com.example.eurekaclient01.service.LoginUserService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/26 10:45
 */
@RestController
public class LoginUserController {

    private static Logger logger = LoggerFactory.getLogger(LoginUserController.class);

    @Autowired
    private LoginUserService loginUserService;

    @PostMapping("/add")
    public String addUser(@RequestBody LoginUser loginUser) {
        logger.info("parameter is :{}", loginUser.toString());
        Integer i = loginUserService.addLoginUser(loginUser);
        return i > 0 ? "succeed" : "error";
    }

    @GetMapping("/getId")
    public String findUserById(@RequestParam("id") Integer id) {
        logger.info("parameter is :{}", id);
        return new Gson().toJson(loginUserService.findLoginUserById(id));
    }

    @GetMapping("/getAll")
    public String findAllUserBy() {
        logger.info("parameter is :{all}");
        return new Gson().toJson(loginUserService.findAllLoginUser());
    }
}
