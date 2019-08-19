package com.luan.service.impl;

import com.luan.dao.UserMapper;
import com.luan.model.User;
import com.luan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }
}
