package com.phx.springboot.basic_use_of_middleware.mysql_mybatis.controller;

import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.dao.User;
import com.phx.springboot.basic_use_of_middleware.mysql_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userInsert")
    public int userInsert(User user) {
        return userService.insert(user);
    }

    @RequestMapping("/userDelete")
    public int userDelete(int id) {
        return userService.delete(id);
    }

    @RequestMapping("/userUpdate")
    public int userUpdate(User user) {
        return userService.update(user);
    }

    @RequestMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getALLUsers();
    }

    @RequestMapping("/getUserById")
    public User getUserById(int id) {
        return userService.getUserById(id);
    }



}
