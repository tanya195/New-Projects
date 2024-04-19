package com.rudecrab.demo.exception;

import lombok.Getter;


@Getter //只要getter方法，无需setter
public class APIException extends RuntimeException {
    private int code;
    private String msg;

    public APIException() {
        this(1001, "port error");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
