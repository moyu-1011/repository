package com.example.slf4j.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String jenkins(){
        return "Counter Web App \n
		counter = 1 ";
    }

}
