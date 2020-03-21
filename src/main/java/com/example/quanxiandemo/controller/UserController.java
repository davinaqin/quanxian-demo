package com.example.quanxiandemo.controller;

import com.example.quanxiandemo.entity.MyUser;
import com.example.quanxiandemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/doRegister")
    public String register(MyUser user){
        Integer result = userService.register(user);
        if (result == 1){
            return "注册成功";
        }else {
            return "注册失败";
        }
    }
}
