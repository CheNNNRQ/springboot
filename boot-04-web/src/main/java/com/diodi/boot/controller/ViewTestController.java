package com.diodi.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author diodi
 * @create 2021-06-03-15:29
 */
@Controller
public class ViewTestController {
    @GetMapping("/diodi")
    public String diodi(Model model){
        model.addAttribute("msg", "你好吃了吗");
        model.addAttribute("link", "www.baidu.com");
               return "success";
    }
}
