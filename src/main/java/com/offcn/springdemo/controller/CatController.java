package com.offcn.springdemo.controller;

import com.offcn.springdemo.Model.Cat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//整个类返回json字符串
@RestController

@Validated
@RequestMapping("/cat")
public class CatController {

    @RequestMapping(path = "/find" ,method = RequestMethod.GET)
    public Cat getCat(){
        Cat car = new Cat();
        car.setId(1);
        car.setCreateDate(new Date());
        car.setName("段华宝傻逼");
        return car;
    }

    @RequestMapping("/findList")
    public List<Cat> catList(){
        Cat car = new Cat();
        car.setId(1);
        car.setCreateDate(new Date());
        car.setName("段华宝傻逼");
        List<Cat> list=new ArrayList();
        list.add(car);
        list.add(car);
        list.add(car);
        return list;
    }

    @RequestMapping(path = "/post/{id}")
    public Cat postCar(@PathVariable (name = "id") Integer carId){
        Cat car=new Cat();
        car.setId(10);
        car.setName("你好");
        if (carId==car.getId()){
            return car;
        }else {
            return new Cat();
        }
    }

    @RequestMapping(path = "/postName")
    public Cat postCar(@RequestParam(name = "dd") String carName){
        Cat car=new Cat();
        car.setId(10);
        car.setName("你好");
        if (carName.equals(car.getName())){
            return car;
        }else {
            return new Cat();
        }
    }

    @RequestMapping("/postNmaeAndId/{id}")
    public Cat postNmaeAndId (@RequestParam(name="dd") String name, @PathVariable(name ="id") Integer id){
        Cat car=new Cat();
        car.setId(id);
        car.setName(name);

            return car;
    }


    @RequestMapping("/t2")
    public String t2(
            @NotBlank(message = "group不能为空")
            @RequestParam(name = "group") String group,
            @NotBlank(message = "邮箱不能为空")
            @Email(message = "邮箱格式不正确")
            @RequestParam (name ="email") String email){
        return group +":"+email;
    }
}
