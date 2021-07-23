package com.diodi.boot.controller;

import com.diodi.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author diodi
 * @create 2021-06-01-21:57
 */
@RestController
public class HelloController {
    @Autowired
    Person p;
    @RequestMapping("/person")
    public Person person(){
        return p;
    }
}
