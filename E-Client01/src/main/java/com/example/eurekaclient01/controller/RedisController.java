package com.example.eurekaclient01.controller;

import com.example.eurekaclient01.entity.UserEntity;
import com.example.eurekaclient01.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

    private static int ExpireTime = -1;   // 当时间<0时为永久保存。时间单位为秒(s)

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisSet(String key, String value) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("谢谢惠顾");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());

        return redisUtil.set(key, userEntity, ExpireTime);

//        return redisUtil.set(key, value);
    }

    @RequestMapping("get")
    public Object redisGet(String key) {
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key) {
        return redisUtil.expire(key, ExpireTime);
    }

    @RequestMapping("hget")
    public Object redisHmGet(String key, String item) {
        logger.info("key:{}    item:{}", key, item);
        return redisUtil.hget(key, item);
    }

    @RequestMapping("hmset")
    public boolean redisHmSet(String key) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zzzs");
        map.put("age", "87");
        return redisUtil.hmset(key, map);
    }

}