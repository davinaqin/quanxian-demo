package com.example.quanxiandemo.service;

import com.example.quanxiandemo.dao.SysUserDao;
import com.example.quanxiandemo.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
public class SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    public ArrayList<SysUser> list(){
        log.info("查询开始...");
        ArrayList<SysUser> sysUsers = sysUserDao.list();
        log.info("查询结束...，结果为{}",sysUsers);
        return sysUsers;
    }
}
