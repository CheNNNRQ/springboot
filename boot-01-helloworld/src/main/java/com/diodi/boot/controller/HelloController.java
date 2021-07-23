package com.diodi.boot.controller;

import com.diodi.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author diodi
 * @create 2021-05-29-14:18
 */
//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello Spring boot ";
    }
}
