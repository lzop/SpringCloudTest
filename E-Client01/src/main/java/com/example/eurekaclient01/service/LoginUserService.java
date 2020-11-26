package com.example.eurekaclient01.service;

import com.example.eurekaclient01.entity.LoginUser;

import java.util.List;

public interface LoginUserService {
    Integer addLoginUser(LoginUser loginUser);

    LoginUser findLoginUserById(Integer id);

    List<LoginUser> findAllLoginUser();
}
