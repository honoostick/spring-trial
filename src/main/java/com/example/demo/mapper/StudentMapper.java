package com.example.demo.mapper;

import com.example.demo.model.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * <p>
 * StudentMapper
 * </p>
 *
 * @author strk2333
 * @since 2020-09-18
 */

@Component
@Mapper
public interface StudentMapper {
    @Insert("insert into student(sno, sname, ssex) values(#{sno}, #{sname}, #{sex})")
    int add(Student student);

    @Update("update student set sname=#{sname}, ssex=#{sex} where sno=#{sno}")
    int update(Student student);

    @Delete("delete from student where sno=#{sno}")
    int deleteByIds(String sno);

    @Select("select sno, sname, ssex from student where sno=#{id}")
    @Results(id="student", value = {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "sname", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)
    })
    Student queryStudentById(Long id);

    @Select("select sno, sname, ssex from student")
    @Results(id="student", value = {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "sname", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)
    })
    Student queryAllStudent();
}
