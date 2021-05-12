package com.example.slf4j.controller;

import com.example.slf4j.service.BaseMathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/math")
public class MathController {

    @Autowired
    private BaseMathService mathService;

    @GetMapping("/test/{num1}/{num2}")
    @ResponseBody
    public int getAddResult(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        System.out.println("jenkins");
        return mathService.add(num1, num2);
    }

}
