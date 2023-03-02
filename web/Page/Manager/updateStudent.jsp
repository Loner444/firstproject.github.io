<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.citsoft.service.StudentService" %>
<%@ page import="com.citsoft.service.impl.StudentServiceImpl" %>
<%@ page import="com.citsoft.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: Loner
  Date: 2021/12/21
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <script src="https://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <title>修改学生信息</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        StudentService service = new StudentServiceImpl();
        Student student = service.queryStudent(id);
    %>
    <h1 style="text-align: center">请修改学生信息</h1>
    <form action="../../managerServlet" method="post">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>年级</th>
                    <th>班级</th>
                    <th>C语言成绩</th>
                    <th>java成绩</th>
                    <th>c++成绩</th>
                </tr>
            </thead>
            <tbody>
            <tr>
                <th><input type="text" name="id" value=<%=student.getId()%>></th>
                <th><input type="text" name="name" value=<%=student.getName()%>></th>
                <th><input type="text" name="grade" value=<%=student.getGrade()%>></th>
                <th><input type="text" name="stuClass" value=<%=student.getStuClass()%>></th>
                <th><input type="text" name="cScore" value=<%=student.getcScore()%>></th>
                <th><input type="text" name="javaScore" value=<%=student.getJavaScore()%>></th>
                <th><input type="text" name="cppScore" value=<%=student.getCppScore()%>></th>
            </tr>
            </tbody>
        </table>
        <input type="hidden" name="status" value="update">
        <div style="text-align: center">
            <button type="submit" class="btn btn-primary">提交</button>
        </div>
    </form>
</body>
</html>
