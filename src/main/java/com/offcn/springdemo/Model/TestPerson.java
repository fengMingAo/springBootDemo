package com.offcn.springdemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@PropertySource("classPath:test.properties")
@ConfigurationProperties(prefix = "testperson")
public class TestPerson implements Serializable {
    private String name;
    private String id;
    private String school;
    private String age;
}
