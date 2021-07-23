package com.diodi.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author diodi
 * @create 2021-06-04-19:38
 */
//@WebServlet(urlPatterns = "/my")
@Slf4j
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        log.info("servlet1111111");
        super.doGet(req , resp);
    }
}
