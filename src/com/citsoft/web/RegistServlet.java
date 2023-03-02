package com.citsoft.web;

import com.citsoft.pojo.User;
import com.citsoft.service.UserService;
import com.citsoft.service.impl.USerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistServlet extends HttpServlet {

    private UserService userService = new USerServiceImpl();


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        System.out.println(username + " " + password +" " + email);
        if(userService.existUsername(username)) {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"用户名重复，注册失败\");\n" +
                    "window.history.back();\n" +
                    "    </script>");
            System.out.println("用户名已存在");
        } else {
            System.out.println("用户名可用");
            userService.registUser(new User(null,username,password,email));
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"注册成功\");\n" +
                    "        window.location.href = \"http://localhost:8080/MyProject/index.html\";\n" +
                    "    </script>");
        }
    }
}
