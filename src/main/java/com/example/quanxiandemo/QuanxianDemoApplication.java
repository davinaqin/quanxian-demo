package com.example.quanxiandemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.example.quanxiandemo.dao")
//@ServletComponentScan("com.example.quanxiandemo.*")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class QuanxianDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuanxianDemoApplication.class, args);
    }

}
