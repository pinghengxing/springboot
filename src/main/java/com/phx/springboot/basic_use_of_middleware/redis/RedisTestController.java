package com.phx.springboot.basic_use_of_middleware.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/redis")
public class RedisTestController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @RequestMapping(value = "/insert")
    public  String insert(String key,String value){
        redisTemplate.opsForValue().set(key,value);
        return "success";
    }

    @RequestMapping(value = "/get")
    public  String delete(String key){
        return (String) redisTemplate.opsForValue().get(key);
    }



}
