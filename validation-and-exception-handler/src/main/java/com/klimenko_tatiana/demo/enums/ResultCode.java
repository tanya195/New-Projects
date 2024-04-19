package com.rudecrab.demo.enums;

import lombok.Getter;


@Getter
public enum ResultCode {

    SUCCESS(1000, "success"),

    FAILED(1001, "failure"),

    VALIDATE_FAILED(1002, "check of parameters failed"),

    ERROR(5000, "unknown error");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
