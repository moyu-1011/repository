package com.example.slf4j.service.impl;

import com.example.slf4j.service.Slf4jService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Slf4jServiceImpl implements Slf4jService {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jServiceImpl.class);

    @Override
    public void open() {
        String methodName = "open";
        logger.info("You entered method {}.", methodName);
    }

    @Override
    public void putAnimal() {
        String methodName = "putAnimal";
        logger.info("You entered method {}.", methodName);
    }

    @Override
    public void close() {
        String methodName = "close";
        logger.info("You entered method {}.", methodName);
    }
}
