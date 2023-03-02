<%@ page import="com.citsoft.pojo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Loner
  Date: 2021/12/21
  Time: 8:47
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
    <title>查询学生信息</title>
</head>
<body>
    <%
        Student student = (Student) request.getAttribute("student");

    %>
    <h1 style="text-align: center">学生<%=student.getName()%>信息如下</h1>
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
            <th>总分</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><%=student.getId()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getGrade()%></td>
            <td><%=student.getStuClass()%></td>
            <td><%=student.getcScore()%></td>
            <td><%=student.getJavaScore()%></td>
            <td><%=student.getCppScore()%></td>
            <td><%=student.getTotalScore()%></td>
            <td>
                <form action="Page/Manager/updateStudent.jsp" method="post">
                    <input type="hidden" name="id" value = "<%=student.getId()%>">
                    <button name="status" value="update">修改学生信息</button>
                </form>
            </td>
        </tr>
        </tbody>
    </table>
</body>
</html>
