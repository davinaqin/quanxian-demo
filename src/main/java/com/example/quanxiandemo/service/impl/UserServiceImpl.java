package com.example.quanxiandemo.service.impl;

import com.example.quanxiandemo.common.AppException;
import com.example.quanxiandemo.dao.MyUserDao;
import com.example.quanxiandemo.entity.MyRole;
import com.example.quanxiandemo.entity.MyUser;
import com.example.quanxiandemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MyUserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public MyUser loadUserByUsername(String s) {
        log.info("查询开始。。。，条件为{}",s);
        MyUser user = userDao.loadUserByUsername(s);
        return user;
    }

    @Override
    public ArrayList<MyRole> getRoleList(Integer userId) {
        log.info("roleList查询开始...");
        ArrayList<MyRole> rolesList = userDao.getRoleList(userId);
        log.info("查询结束...,roleList为{}",rolesList);
        return rolesList;
    }


    @Override
    public Integer register(MyUser user) {
        log.info("用户注册开始...,用户参数为{}，{}，{}",user,user.getName(),user.getPassword());
        if (user.getName().isEmpty() || user.getPassword().isEmpty()){
            log.error("用户名或密码不能为空！");
            throw new AppException("用户名或密码不能为空！");
        }
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        Integer i = userDao.register(user);
        if (i != null){
            log.info("注册成功");
        }else {
            log.error("注册失败");
            throw new AppException("注册失败");
        }
        return i;
    }
}
