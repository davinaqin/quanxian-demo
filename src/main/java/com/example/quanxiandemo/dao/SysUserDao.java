package com.example.quanxiandemo.dao;

import com.example.quanxiandemo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface SysUserDao {
    ArrayList<SysUser> list();
}
