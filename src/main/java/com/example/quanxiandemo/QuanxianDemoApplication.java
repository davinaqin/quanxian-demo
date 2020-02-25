package com.example.quanxiandemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.example.quanxiandemo.dao")
@ServletComponentScan
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class QuanxianDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuanxianDemoApplication.class, args);
    }

}
