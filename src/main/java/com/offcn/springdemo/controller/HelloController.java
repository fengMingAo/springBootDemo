package com.offcn.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    //访问路径  ,请求方式
    @RequestMapping(path = "/hello" ,method= RequestMethod.GET)
    @ResponseBody
    public String t(){
        return "hello";
    }
}
