package com.example.slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Slf4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Slf4jApplication.class, args);
    }


}
