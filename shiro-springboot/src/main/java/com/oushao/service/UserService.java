package com.oushao.service;

import com.oushao.pojo.User;


public interface UserService {
    User queryUserByName(String username);
}
