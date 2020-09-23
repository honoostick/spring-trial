package com.example.demo.controller;

import com.example.demo.beans.User;
import com.example.demo.model.entity.Student;
import com.example.demo.model.vo.UserRegisterVo;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    StudentService studentService;

    @RequestMapping("/test")
    public Student testQuery() {
        return studentService.queryStudentById(1l);
    }
}
