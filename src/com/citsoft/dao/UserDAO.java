package com.citsoft.dao;

import com.citsoft.pojo.User;

import java.util.List;

public interface UserDAO {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return 如果返回null说明用户不存在
     */
    public Object queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return 如果返回null用户账号或密码错误
     */
    public User queryByUsernameAndPwd(String username,String password);


    /**
     * 注册用户
     * @return 表示受影响的行数，如果返回-1则说明保存失败
     */
    public int saveUser(User user);

    /**
     * 查询所有用户
     * @return 返回所有用户
     */
    public List<User> queryAllUser();

}
