package com.offcn.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表示整个类返回json字符串
@RestController
public class NewHelloController {

    @RequestMapping("/DD")
    public String t(){
        return "hello springboot";
    }
}
