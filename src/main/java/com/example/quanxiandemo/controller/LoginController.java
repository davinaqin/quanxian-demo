package com.example.quanxiandemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // Login form
    @RequestMapping("/login.html")
    public String login() {
        return "login";
    }

    @RequestMapping("/error.html")
    public String error(){
        return "error";
    }
}
