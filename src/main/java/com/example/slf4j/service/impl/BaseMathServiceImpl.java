package com.example.slf4j.service.impl;

import com.example.slf4j.service.BaseMathService;
import org.springframework.stereotype.Service;

@Service
public class BaseMathServiceImpl implements BaseMathService {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 * num2;
    }
}
