package com.citsoft.web;

import com.citsoft.pojo.Student;
import com.citsoft.service.StudentService;
import com.citsoft.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ManagerServlet extends HttpServlet {

    StudentService service = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码
        resp.setContentType("text/html;charset=UTF-8");
        String status = req.getParameter("status");
        if (status.equals("query")) {
            query(req, resp);
        } else if (status.equals("update")) {
            update(req, resp);
        } else if (status.equals("delete")) {
            delete(req, resp);
        } else if (status.equals("add")) {
            add(req, resp);
        }
    }

    //查询学生信息    按照学号查找
    protected void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("stuID");
        Student student = service.queryStudent(id);
        if(student == null) {
            PrintWriter writer = resp.getWriter();
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"查询失败，请检查学号是否正确\");\n" +
                    "window.history.back();\n" +
                    "    </script>");
        } else {
            req.setAttribute("student", student);
            req.getRequestDispatcher("Page/Manager/queryStudent.jsp").forward(req, resp);
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String grade = req.getParameter("grade");
        String stuClass = req.getParameter("stuClass");
        int cScore = Integer.valueOf(req.getParameter("cScore")).intValue();
        int javaScore = Integer.valueOf(req.getParameter("javaScore")).intValue();
        int cppScore = Integer.valueOf(req.getParameter("cppScore")).intValue();
        Student student = new Student(id, name, grade, stuClass, cScore, javaScore, cppScore, null);
        boolean res = service.updateStudent(student);
        PrintWriter writer = resp.getWriter();
        if (res) {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"修改成功\");\n" +
                    "        window.location.href = \"http://localhost:8080/MyProject/studentServlet\";\n" +
                    "    </script>");
        } else {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"修改失败，请检查学号是否正确\");\n" +
                    "window.history.back();\n" +
                    "    </script>");
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean res = service.delStudent(id);
        PrintWriter writer = resp.getWriter();
        if (res) {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"删除成功\");\n" +
                    "        window.location = \"../../MyProject/studentServlet\";\n" +
                    "    </script>");
            System.out.println("删除成功");
        } else {
            writer.print("<script type=\"text/javascript\">\n" +
                    "    alert(\"删除失败，请检查学号\");\n" +
                    "window.history.back();\n" +
                    "  </script>");
            System.out.println("删除失败");
        }
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String grade = req.getParameter("grade");
        String stuClass = req.getParameter("stuClass");
        int cScore = Integer.valueOf(req.getParameter("cScore")).intValue();
        int javaScore = Integer.valueOf(req.getParameter("javaScore")).intValue();
        int cppScore = Integer.valueOf(req.getParameter("cppScore")).intValue();
        Student student = new Student(id, name, grade, stuClass, cScore, javaScore, cppScore, null);
        boolean res = service.addStudent(student);
        PrintWriter writer = resp.getWriter();
        if (res) {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"添加成功\");\n" +
                    "        window.location.href = \"http://localhost:8080/MyProject/studentServlet\";\n" +
                    "    </script>");
            System.out.println("保存成功");
        } else {
            writer.print("<script type=\"text/javascript\">\n" +
                    "        alert(\"添加失败，请检查学号是否已经存在\");\n" +
                    "window.history.back();\n" +
                    "    </script>");
            System.out.println("保存失败");
        }
    }


}
