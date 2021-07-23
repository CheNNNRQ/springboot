package com.diodi.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.diodi.admin.bean.User;
import com.diodi.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @author diodi
 * @create 2021-06-03-21:38
 */
@Controller
public class TableController {
    @Autowired
    UserService userService;
    @GetMapping("/user/del/{id}")
    public String deleteUser(@PathVariable(value = "id")Long id,
                             @RequestParam(value = "pg" ,defaultValue = "1")Integer pg,
                             RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pg",pg);
        return "redirect:/dynamic_table";
    }
    @GetMapping("/basic_table")
    public String goToBasic(){
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String goToDynamic(@RequestParam(value = "pg" ,defaultValue = "1")Integer pg, Model model){
//        List<User> users = Arrays.asList(new User("zhangsan" , "123") , new User("lisi" , "1234") , new User("wangwu" , "12345") , new User("zhaoliu" , "123456"));
//        model.addAttribute("users", users);
        List<User> list = userService.list();
//        model.addAttribute("users", list);
        //分页查询数据
        Page<User> userPage = new Page<>(pg , 2 );
        //分页查询结果
        Page<User> page = userService.page(userPage , null);
        model.addAttribute("pages", page);

        return "table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String goToEditable(){
        return "table/editable_table";
    }
    @GetMapping("/pricing_table")
    public String goToPricing(){
        return "table/pricing_table";
    }
    @GetMapping("/responsive_table")
    public String goToResponsive(){
        return "table/responsive_table";
    }
}
