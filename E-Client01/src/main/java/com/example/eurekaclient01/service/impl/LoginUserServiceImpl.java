package com.example.eurekaclient01.service.impl;

import com.example.eurekaclient01.entity.LoginUser;
import com.example.eurekaclient01.mapper.LoginUserMapper;
import com.example.eurekaclient01.service.LoginUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/26 10:42
 */
@Service
public class LoginUserServiceImpl implements LoginUserService {
    private static final Logger logger = LoggerFactory.getLogger(LoginUserServiceImpl.class);

    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public Integer addLoginUser(LoginUser loginUser) {
        return loginUserMapper.addLoginUser(loginUser);
    }

    @Override
    public LoginUser findLoginUserById(Integer id) {
        return loginUserMapper.findLoginUserById(id);
    }

    @Override
    public List<LoginUser> findAllLoginUser() {
        return loginUserMapper.findAllLoginUser();
    }
}
