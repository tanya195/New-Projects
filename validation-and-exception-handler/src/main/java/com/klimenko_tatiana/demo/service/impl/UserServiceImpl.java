package com.rudecrab.demo.service.impl;

import com.rudecrab.demo.entity.User;
import com.rudecrab.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {

        return "success";
    }
}
