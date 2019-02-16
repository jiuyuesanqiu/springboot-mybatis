package com.github.jiuyusanqiu.service;

import com.github.jiuyusanqiu.mapper.UserMapper;
import com.github.jiuyusanqiu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        return user;
    }

}
