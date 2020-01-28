package com.tproject.TProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trial {

    @GetMapping("/hello")
    public String hello(){
        return "Hello.";
    }
}
