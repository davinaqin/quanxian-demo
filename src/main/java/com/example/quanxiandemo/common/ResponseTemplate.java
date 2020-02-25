package com.example.quanxiandemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private T data;

    public ResponseTemplate(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static <T> ResponseTemplate<T> success(){
        return new ResponseTemplate<T>(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMessage());
    }

    public static <T> ResponseTemplate<T> success(String msg) {
        return new ResponseTemplate<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ResponseTemplate<T> success(ResponseCode resultCode) {
        return new ResponseTemplate<T>( resultCode.getCode(),  resultCode.getMessage());
    }

    public static <T> ResponseTemplate<T> success(T data) {
        return new ResponseTemplate<T>( ResponseCode.SUCCESS.getCode(),  ResponseCode.SUCCESS.getMessage(), null, data);
    }

    public static <T> ResponseTemplate<T> success(ResponseCode resultCode, Integer count,T data) {
        return new ResponseTemplate<T>( resultCode.getCode(),  resultCode.getMessage(), count, data);
    }

    public static <T> ResponseTemplate<T> failure() {
        return new ResponseTemplate<T>( ResponseCode.FAIL.getCode(), ResponseCode.FAIL.getMessage());
    }

    public static <T> ResponseTemplate<T> failure(ResponseCode resultCode) {
        return new ResponseTemplate<T>( resultCode.getCode(),  resultCode.getMessage());
    }

    public static <T> ResponseTemplate<T> failure(Integer code, String msg) {
        return new ResponseTemplate<T>( code,  msg);
    }

    public static ResponseTemplate ok() {
        return new ResponseTemplate();
    }
}
