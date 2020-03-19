package com.example.quanxiandemo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate<T> {
    private Boolean success;
    private String reason;
    private T data;

    public static ResponseTemplate ok(){
        return ok();
    }

    public static <T> ResponseTemplate<T> ok(T data){
        ResponseTemplate<T> response = new ResponseTemplate<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }
}

