package com.rudecrab.demo.vo;

import com.rudecrab.demo.enums.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
@ApiModel
public class ResultVO<T> {
    @ApiModelProperty(value = "Status code", notes = "Default 1000")
    private int code;
    @ApiModelProperty(value = "Response information", notes = "explains the response")
    private String msg;
    @ApiModelProperty(value = "Specific data of the response")
    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
