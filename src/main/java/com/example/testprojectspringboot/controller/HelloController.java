package com.example.testprojectspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //@RequestMapping(value = "/hello", method = RequestMethod.GET)//고전적 방법
    @GetMapping("hello")
    public String hello(){
        return "hello world!";
    }
}
