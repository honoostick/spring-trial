package com.example.demo.service;

import com.example.demo.beans.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    final private UserMapper ud;

    UserService(UserMapper ud) {
        this.ud = ud;
    }

    public User selectUserByName(String name) {
        return ud.findUserByName(name);
    }

    public Boolean register(String account, String password, int registerSource, int userSource) {
        return ud.register(account, password, registerSource, userSource);
    }
}
