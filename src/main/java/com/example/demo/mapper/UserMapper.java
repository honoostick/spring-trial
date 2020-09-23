package com.example.demo.mapper;

import com.example.demo.beans.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserDao")
public interface UserMapper {
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(@Param("name") String name);

    @Insert("INSERT INTO user (name, password, registerSource, userSource) VALUES (#{name}, #{password(password)}, #{registerSource}, #{userSource}")
    Boolean register(@Param("name") String name,
                     @Param("password") String password,
                     @Param("registerSource") int registerSource,
                     @Param("userSource") int userSource);
}
