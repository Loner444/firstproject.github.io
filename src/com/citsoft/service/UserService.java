package com.citsoft.service;

import com.citsoft.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     * @return 返回null说明登录失败，有值则说明登录成功
     */
    public User login(User user);

    /**
     * 检查用户是否可用
     * @param username
     * @return 返回true表示用户名已存在，返回false表示可用
     */
    public boolean existUsername(String username);

    /**
     *
     * @return 返回所有用户
     */
    public List<User> Users();


}
