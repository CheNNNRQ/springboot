package com.diodi.admin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.thymeleaf.standard.expression.Each;

/**
 * @author diodi
 * @create 2021-06-13-17:40
 */
@DisplayName("junit5测试")
public class Junit5Test {
    @BeforeEach
    void beforeEach(){
        System.out.println("测试开始");
    }
    @AfterEach
    void afterEach(){
        System.out.println("测试结束");
    }
    @Test
    @DisplayName("测试DisplayName")
    void testDisplayName(){
        System.out.println("1");
    }
}
