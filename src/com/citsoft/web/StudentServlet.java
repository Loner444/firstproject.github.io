package com.citsoft.web;

import com.citsoft.dao.StudentsDAO;
import com.citsoft.dao.impl.StudentDAOImpl;
import com.citsoft.pojo.Student;
import com.citsoft.service.StudentService;
import com.citsoft.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = service.Students();
        req.setAttribute("Students",students);
        req.getRequestDispatcher("printStudents.jsp").forward(req,resp);
    }
}
