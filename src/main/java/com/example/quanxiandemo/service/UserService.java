package com.example.quanxiandemo.service;

import com.example.quanxiandemo.entity.MyRole;
import com.example.quanxiandemo.entity.MyUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    MyUser loadUserByUsername(String s);

    ArrayList<MyRole> getRoleList(Integer userId);

    Integer register(MyUser user);
}
