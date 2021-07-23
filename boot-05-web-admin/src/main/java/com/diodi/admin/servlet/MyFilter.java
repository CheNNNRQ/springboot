package com.diodi.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author diodi
 * @create 2021-06-04-20:18
 */
@Slf4j
//@WebFilter(urlPatterns ={"/css/*","/images/*"}) //一个*是servlet的写法 两个*是spring的写法
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest , ServletResponse servletResponse , FilterChain filterChain) throws IOException, ServletException {
        log.info("工作");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("前置");
    }

    @Override
    public void destroy() {
        log.info("后置");
    }
}
