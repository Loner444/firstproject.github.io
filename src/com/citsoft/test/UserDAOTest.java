package com.citsoft.test;

import com.citsoft.dao.UserDAO;
import com.citsoft.dao.impl.UserDAOImpl;
import com.citsoft.pojo.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOImplTest {

    UserDAO userDAO = new UserDAOImpl();

    @Test
    void queryUserByUsername() {
        if(userDAO.queryUserByUsername("admin") == null) {
            System.out.println("用户名可用");
        } else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    void queryByUsernameAndPwd() {
        User user = userDAO.queryByUsernameAndPwd("admin", "admin");
        if(user == null) {
            System.out.println("用户名或密码输入有误,登录失败");
        } else {
            System.out.println("登录成功");
        }
    }

    @Test
    void saveUser() {
        if(userDAO.saveUser(new User(null,"111","123","1234@qq.com")) == -1) {
            System.out.println("注册失败");
        } else {
            System.out.println("注册成功");
        }
    }

    @Test
    void queryUser() {
        List<User> users = userDAO.queryAllUser();
        System.out.println(users);
    }
}