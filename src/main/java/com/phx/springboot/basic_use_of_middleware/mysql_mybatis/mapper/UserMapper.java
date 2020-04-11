package com.phx.springboot.basic_use_of_middleware.mysql_mybatis.mapper;

import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.dao.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    //通过Options获取主键
    @Insert("INSERT INTO user(name,sex,age) VALUES (#{name},#{sex}, #{age}) ")
    @Options(useGeneratedKeys= true, keyProperty="id")
    public int insert(User user);

    @Delete("DELETE FROM user WHERE id =  #{id}")
    int delete(int id);

    @Update("UPDATE user SET name = #{name}, sex=#{sex},age = #{age} WHERE id = #{id}")
    int update(User user);

    @Select("SELECT * FROM user")
    public List<User> selectAll();

    @Select("SELECT * FROM user where id=#{id}")
    public User getUserById(int id);





}
