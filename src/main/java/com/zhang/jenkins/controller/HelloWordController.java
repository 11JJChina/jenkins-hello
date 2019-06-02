package com.zhang.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/sayHello")
    public String say(){
        return "Welcome to Jenkins";
    }
}