package com.example.quanxiandemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyUser {
    private Integer id;
    private String name;
    private String password;
}
