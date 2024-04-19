package com.rudecrab.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@ApiModel("user")
public class User {
    @ApiModelProperty("user id")
    @NotNull(message = "user id can not be empty field")
    private Long id;

    @ApiModelProperty("user account")
    @NotNull(message = "can not be empty field")
    @Size(min = 6, max = 11, message = "should be 6-11 symbols")
    private String account;

    @ApiModelProperty("user password")
    @NotNull(message = "can not be empty field")
    @Size(min = 6, max = 11, message = "should be 6-16 symbols")
    private String password;

    @ApiModelProperty("email")
    @NotNull(message = "can not be empty field")
    @Email(message = "should be 6-16 symbols")
    private String email;
}
