package com.example.quanxiandemo.dao;

import com.example.quanxiandemo.entity.MyPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface MyRoleDao {
    ArrayList<MyPermission> getPermissionByRoleId(@Param("roleId") Integer roleId);
}
