package com.example.quanxiandemo.dao;

import com.example.quanxiandemo.entity.MyRole;
import com.example.quanxiandemo.entity.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface MyUserDao {

    MyUser loadUserByUsername(@Param("s") String s);

    ArrayList<MyRole> getRoleList(@Param("userId") Integer userId);

    Integer register(@Param("user") MyUser user);
}
