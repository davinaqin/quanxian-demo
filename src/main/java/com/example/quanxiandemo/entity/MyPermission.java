package com.example.quanxiandemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyPermission {
    private Integer id;
    private String permissionName;
    private String url;
}
