package com.luan.service;

import com.luan.model.User;

public interface UserService {
    User findUserByUsername(String username);
}
