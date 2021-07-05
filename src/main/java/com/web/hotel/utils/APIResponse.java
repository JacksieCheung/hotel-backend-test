package com.web.hotel.utils;

import lombok.NoArgsConstructor;

public class APIResponse <T> {
    private static final String CODE_SUCCESS = "200";
    private static final String CODE_FAIL_401 = "401";
    private static final String CODE_FAIL_404 = "404";
    private static final String CODE_FAIL_500 = "500";
    private String code;
    private T data;
    private String msg;

    public APIResponse(){}

    public APIResponse(String code){
        this.code = code;
    }

    public APIResponse(String code, T data){
        this.code = code;
        this.data = data;
    }

    public APIResponse(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static APIResponse success(){
        return new APIResponse(CODE_SUCCESS);
    }

    public static APIResponse success(Object data){
        return new APIResponse(CODE_SUCCESS, data);
    }

    public static APIResponse fail401(String msg){
        return new APIResponse(CODE_FAIL_401, msg);
    }

    public static APIResponse fail404(String msg){
        return new APIResponse(CODE_FAIL_404, msg);
    }

    public static APIResponse fail500(String msg){
        return new APIResponse(CODE_FAIL_500, msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static String getCodeFail401() {
        return CODE_FAIL_401;
    }

    public static String getCodeFail404() {
        return CODE_FAIL_404;
    }

    public static String getCodeFail500() {
        return CODE_FAIL_500;
    }

    public static String getCodeSuccess() {
        return CODE_SUCCESS;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}