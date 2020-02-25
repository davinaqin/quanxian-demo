package com.example.quanxiandemo.controller;

import com.example.quanxiandemo.common.ResponseCode;
import com.example.quanxiandemo.common.ResponseTemplate;
import com.example.quanxiandemo.entity.SysUser;
import com.example.quanxiandemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/list")
    @ResponseBody
    public ResponseTemplate list(){
        ArrayList<SysUser> sysUsers = userService.list();
        return ResponseTemplate.success(ResponseCode.SUCCESS,sysUsers.size(),sysUsers);
    }
}
