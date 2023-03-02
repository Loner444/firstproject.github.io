package com.citsoft.web;

import com.citsoft.pojo.User;
import com.citsoft.service.UserService;
import com.citsoft.service.impl.USerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    private UserService userService = new USerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //保存用户信息
        List<User> users = userService.Users();
        req.setAttribute("Users",users);
        req.getRequestDispatcher("printUser.jsp").forward(req, resp);

    }
}
