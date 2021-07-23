package com.diodi.boot;

import com.diodi.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author diodi
 * @create 2021-05-29-14:11
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 1. 返回IoC容器，IoC容器里面就包含了当前应用的所有组件
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class , args);
        // 1. 返回IoC容器，IoC容器里面就包含了当前应用的所有组件
        for(String beanDefinitionName : run.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        //从容器中获取组件
        User user01 = run.getBean("user01" , User.class);
    }
}
