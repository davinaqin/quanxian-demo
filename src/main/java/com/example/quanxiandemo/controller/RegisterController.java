package com.example.quanxiandemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
    @GetMapping("/register.html")
    public String register(){
        return "register";
    }
}
