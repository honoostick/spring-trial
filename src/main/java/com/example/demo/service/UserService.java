package com.example.demo.service;

import com.example.demo.beans.User;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {
    final private UserDao ud;

    UserService(UserDao ud) {
        this.ud = ud;
    }

    public User selectUserByName(String name) {
        return ud.findUserByName(name);
    }

    public Boolean register(String account, String password, int registerSource, int userSource) {
        return ud.register(account, password, registerSource, userSource);
    }
}
