package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class AyTestController
{
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hello";
    }
}
