package com.citsoft.service.impl;

import com.citsoft.dao.UserDAO;
import com.citsoft.dao.impl.UserDAOImpl;
import com.citsoft.pojo.User;
import com.citsoft.service.UserService;

import java.util.List;

public class USerServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    public void registUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDAO.queryByUsernameAndPwd(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if(userDAO.queryUserByUsername(username) == null) {
            //未查到姓名，说明可用
            return false;
        }
        return true;
    }

    @Override
    public List<User> Users() {
        return userDAO.queryAllUser();
    }

}
