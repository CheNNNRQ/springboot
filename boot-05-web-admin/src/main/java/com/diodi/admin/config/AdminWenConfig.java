package com.diodi.admin.config;

import com.diodi.admin.interceptor.LoginInterceptor;
import com.diodi.admin.interceptor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author diodi
 * @create 2021-06-04-12:34
 */
@Configuration
public class AdminWenConfig implements WebMvcConfigurer {
//    @Autowired
//    RedisUrlCountInterceptor redisUrlCountInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())//拦截器注册到容器中
                .addPathPatterns("/**") // /**表示拦截所有请求 包括静态资源
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");//放行的请求
        //这里不能new 里面的组件需要从容器中获取
//        registry.addInterceptor(redisUrlCountInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
//                        "/js/**","/aa/**");
    }
}
