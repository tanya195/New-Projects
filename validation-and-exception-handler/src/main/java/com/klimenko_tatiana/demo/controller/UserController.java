package com.rudecrab.demo.controller;

import com.rudecrab.demo.entity.User;
import com.rudecrab.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@Api(tags = "port of user")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("add user")
    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @ApiOperation("get user")
    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");
        return user;
    }

}
