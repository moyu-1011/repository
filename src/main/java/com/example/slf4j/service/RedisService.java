package com.example.slf4j.service;

public interface RedisService {
    boolean set(String key, Object value);

    Object get(String key);
}
