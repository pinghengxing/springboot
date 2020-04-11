package com.phx.springboot.basic_use_of_middleware.mysql_mybatis.service;

import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.dao.User;

import java.util.List;

public interface UserService {




    public int insert(User user);

    public int delete(int id);

    public int update(User user);

    public List<User> getALLUsers();

    public User getUserById(int id);
}
