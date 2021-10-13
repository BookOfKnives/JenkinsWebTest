package com.example.jenkinshellotest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value={"/", "/first", "/index"}) @ResponseBody
    public String first(){
        return "hello world22!";
    }

}
