package com.example.quanxiandemo.service;

import com.example.quanxiandemo.entity.MyPermission;
import com.example.quanxiandemo.entity.MyRole;
import com.example.quanxiandemo.entity.MyUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        MyUser user = userService.loadUserByUsername(s);
        if (user == null) {
            log.info("用户不存在");
            throw new UsernameNotFoundException(s);
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (MyRole r : userService.getRoleList(user.getId())) {
            for (MyPermission p : roleService.getPermissionList(r.getId())) {
                authorities.add(new SimpleGrantedAuthority(p.getPermissionName()));
            }
        }
        log.info("authoritis为{}",authorities);
        return new User(user.getName(), user.getPassword(), authorities);
    }
}
