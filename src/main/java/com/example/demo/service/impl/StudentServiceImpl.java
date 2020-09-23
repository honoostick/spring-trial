package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.entity.Student;
import com.example.demo.service.StudentService;
import com.sun.jnlp.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author strk2333
 * @since 2020-09-18
 */

public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int deleteByIds(String sno) {
        return 0;
    }

    @Override
    public Student queryStudentById(Long id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public Student queryAllStudent() {
        return studentMapper.queryStudentById(1L);
    }
}
