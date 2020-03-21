package com.example.quanxiandemo.common;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AppException extends RuntimeException{
    public AppException(String message){
        super(message);
    }
}
