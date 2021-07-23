package com.diodi.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author diodi
 * @create 2021-06-05-17:15
 */
//@Configuration
public class MyDataSourceConfig {
    @Bean
    @ConfigurationProperties("spring.datasource") //跟配置文件中的spring.datasource绑定
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();

        return druidDataSource;
    }
}
