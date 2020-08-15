package com.example.demo.controller;

import com.example.demo.beans.User;
import com.example.demo.model.vo.UserRegisterVo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    final private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/query")
    public User testQuery() {
        return userService.selectUserByName("honoo");
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterVo vo) {
        userService.register(vo.getAccount(), vo.getPassword(), vo.getRegisterSource(), vo.getUserSource());
        System.out.println(vo);
        return vo.toString();
    }
}
