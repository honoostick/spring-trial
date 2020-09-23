package com.example.demo.service;

import com.example.demo.model.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

/**
 * <p>
 * StudentService
 * </p>
 *
 * @author strk2333
 * @since 2020-09-18
 */

@Service
public interface StudentService {
    int add(Student student);

    int update(Student student);

    int deleteByIds(String sno);

    Student queryStudentById(Long id);

    Student queryAllStudent();
}
