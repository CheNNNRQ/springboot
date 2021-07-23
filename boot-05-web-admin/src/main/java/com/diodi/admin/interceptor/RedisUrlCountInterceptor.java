package com.diodi.admin.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author diodi
 * @create 2021-06-07-22:48
 */
//@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {
//    @Autowired
//    StringRedisTemplate stringRedisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception {
        String uri = request.getRequestURI();
//        stringRedisTemplate.opsForValue().increment(uri);
        return true;
    }
}
