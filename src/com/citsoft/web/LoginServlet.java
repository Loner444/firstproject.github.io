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
import java.util.List;

public class LoginServlet extends HttpServlet {
    private UserService userService = new USerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码
        resp.setContentType("text/html;charset=UTF-8");
        // 获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        // 调用 userService.login()登录处理业务
        User loginUser = userService.login(new User(null, username, password, null));
        PrintWriter writer = resp.getWriter();
        // 如果等于 null,说明登录 失败!
        if (loginUser == null) {
            // 跳回登录页面
            System.out.println("用户登录失败");
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"用户登录失败，请检查用户名和密码\");\n" +
                    "        window.history.back();\n" +
                    "    </script>");
        } else {
            // 登录 成功
            //跳到成功页面 login_success.html
            writer.print("");
            req.getRequestDispatcher("loginsuccess.jsp").forward(req, resp);
        }
    }
}