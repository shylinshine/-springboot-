package com.luntanday1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication

public class WuApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuApplication.class, args);
    }




}
