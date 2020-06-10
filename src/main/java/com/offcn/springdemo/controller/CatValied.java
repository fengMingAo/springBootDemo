package com.offcn.springdemo.controller;

import com.offcn.springdemo.Model.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//返回的都是json字符串
@RestController
@RequestMapping("catt1")
public class CatValied {

    @RequestMapping("/t1")
    public Cat t1(@RequestBody @Validated Cat cat){
        cat.setName(cat.getName()+"t1");
        return cat;
    }

    @RequestMapping("/t2")
    public Cat t2(){
        Cat cat = new Cat();
        cat.setId(100);
        cat.setName("zhang san");
        cat.setCreateDate(new Date());
        cat.setIsnull("yes");
        cat.setPrice(2);
        return cat;
    }

}
