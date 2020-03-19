package com.example.quanxiandemo.service.impl;

import com.example.quanxiandemo.dao.MyUserDao;
import com.example.quanxiandemo.entity.MyRole;
import com.example.quanxiandemo.entity.MyUser;
import com.example.quanxiandemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MyUserDao userDao;

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
}
