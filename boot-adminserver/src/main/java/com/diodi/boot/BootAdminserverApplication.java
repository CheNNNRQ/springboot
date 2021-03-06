package com.diodi.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class BootAdminserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAdminserverApplication.class , args);
    }

}
