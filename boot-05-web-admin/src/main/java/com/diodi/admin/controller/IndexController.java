package com.diodi.admin.controller;

import com.diodi.admin.bean.Account;
import com.diodi.admin.bean.City;
import com.diodi.admin.bean.User;
import com.diodi.admin.service.AccountService;
import com.diodi.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author diodi
 * @create 2021-06-03-16:09
 */
@Controller
public class IndexController {
    @Autowired
    AccountService accountService;
    @Autowired
    CityService cityService;
//    @Autowired
//    StringRedisTemplate stringRedisTemplate;
    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }
    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id){
        Account byId = accountService.getById(id);
        return byId;
    }
    /**
     * 访问根路径或login跳转的默认登录页面
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    /**
     * 登陆成功跳转
     * @param user
     * @param session
     * @return
     */
    @PostMapping(value = "/login")
    public String mian(User user, HttpSession session , Model model){
        if("123".equals( user.getUsername()) && "123".equals(user.getPassword())) {
            //把登陆成功的用户的用户存储到session中
            session.setAttribute("loginUser", user);
            //登录成功重定向到main.html 防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "账号密码错误请重试");
            return "login";
        }
    }

    /**
     * 去main
     * @return
     */
    @GetMapping("main.html")
    public String mainPage(HttpSession session, Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser != null) {
//            return "main";
//        }else {
//            model.addAttribute("msg", "账号密码错误请重试");
//            return "login";
//        }
//        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
//        String m = operations.get("/main.html");
//        String s = operations.get("/sql");
//        model.addAttribute("mainCount",m);
//        model.addAttribute("sqlCount",s);
        return "main";
    }
}
