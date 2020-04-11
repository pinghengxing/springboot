package com.phx.springboot.basic_use_of_middleware.mysql_mybatis.service.impl;

import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.dao.User;
import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.mapper.UserMapper;
import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }


    @Override
    public List<User> getALLUsers() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
