package com.example.quanxiandemo.service.impl;

import com.example.quanxiandemo.dao.MyRoleDao;
import com.example.quanxiandemo.entity.MyPermission;
import com.example.quanxiandemo.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {

    @Autowired
    private MyRoleDao myRoleDao;

    @Override
    public ArrayList<MyPermission> getPermissionList(Integer roleId) {
        log.info("getPermissionList开始，roleId为{}",roleId);
        ArrayList<MyPermission> permissionArrayList = myRoleDao.getPermissionByRoleId(roleId);
        log.info("permissionList为{}",permissionArrayList);
        return permissionArrayList;
    }
}
