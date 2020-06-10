package com.offcn.springdemo.controller;


import com.offcn.springdemo.Model.Person;
import com.offcn.springdemo.Model.TestPerson;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/getVale")
@EnableConfigurationProperties({Person.class,TestPerson.class})
public class GetValeController {

    @Value("${offcn_ip}")
    private String offcn_ip;

    @Value("${offcn_port}")
    private String offcn_port;

    @Resource
    private Person person;

    @Resource
    private TestPerson testPerson;

    @RequestMapping("/custom")
    public String t1(){
        return offcn_ip+":"+offcn_port;
    }

    @RequestMapping("/perosn")
    public Person tt(){
        return person;
    }

    @RequestMapping("/testPerson")
    public TestPerson tt2(){
        return testPerson;
    }
}
