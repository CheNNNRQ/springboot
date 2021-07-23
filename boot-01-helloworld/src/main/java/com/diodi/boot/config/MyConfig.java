package com.diodi.boot.config;

import com.diodi.boot.bean.Pet;
import com.diodi.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author diodi
 * @create 2021-05-29-20:59
 */
@Configuration
public class MyConfig {
    @Bean
    public User user01(){
        return new User("张三",18);
    }
    @Bean
    public Pet tomcat01(){
        return new Pet("xiaobai");
    }
}
