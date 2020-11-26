package com.example.eurekaclient01.mapper;

import com.example.eurekaclient01.entity.LoginUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginUserMapper {
    Integer addLoginUser(LoginUser loginUser);

    LoginUser findLoginUserById(Integer id);

    List<LoginUser> findAllLoginUser();
}
