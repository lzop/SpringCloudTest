package com.example.eurekaclient01.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: Lo
 * @time: 2020/11/27 14:53
 */
@Data
public class UserEntity implements Serializable {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;
}
