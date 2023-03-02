package com.citsoft.test;

import com.citsoft.pojo.User;
import com.citsoft.service.UserService;
import com.citsoft.service.impl.USerServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService = new USerServiceImpl();

    @Test
    void registUser() {
        userService.registUser(new User(null,"han1","123han","han@qq.com"));
        userService.registUser(new User(null,"han2","123han","han@qq.com"));
    }

    @Test
    void login() {
        System.out.println(userService.login(new User(null,"asd","123",null)));
    }

    @Test
    void existUsername() {
        boolean eUsername = userService.existUsername("han");
        if(eUsername) {
            System.out.println("用户名已存在");
        } else {
            System.out.println("可注册");
        }
    }

    @Test
    void User() {
        List<User> users = userService.Users();
        System.out.println(users);
    }
}