package com.example.quanxiandemo.service;

import com.example.quanxiandemo.entity.MyPermission;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface RoleService {
    ArrayList<MyPermission> getPermissionList(Integer roleId);
}
