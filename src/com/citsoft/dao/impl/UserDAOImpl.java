package com.citsoft.dao.impl;

import com.citsoft.pojo.User;

import java.util.List;

public class UserDAOImpl extends BaseDAO implements com.citsoft.dao.UserDAO {

    @Override
    public User queryUserByUsername(String username) {
        String sql = "select * from t_user where username = ? ";
        return (User) queryForOne(sql, User.class, username);

    }

    @Override
    public User queryByUsernameAndPwd(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        return (User) queryForOne(sql, User.class, username, password);
    }

    @Override
    public int saveUser(User user) {

        String sql = "insert into t_user(`username`,`password`,`email`) values(?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public List<User> queryAllUser() {
        List<User> users = queryUser();
        return users;
    }


}
