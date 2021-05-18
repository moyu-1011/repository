package com.example.slf4j.controller;

import com.example.slf4j.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisService redisService;
    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

    @GetMapping("/setKey/{key}/{value}")
    public boolean setKey(@PathVariable("key") String key, @PathVariable("value") String value) {
        logger.info("[Redis-set]   key: {}, value: {}", key, value);
        return redisService.set(key, value);
    }

    @GetMapping("/getKey/{key}")
    public Object getKey(@PathVariable("key") String key) {
        logger.info("[Redis-get]   key: {}", key);
        return redisService.get(key);
    }

}
