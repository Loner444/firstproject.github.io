<%--
  Created by IntelliJ IDEA.
  User: Loner
  Date: 2021/12/21
  Time: 8:39
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
    <title>添加学生信息</title>
</head>
<body>
    <h1 style="text-align: center">请输入学生信息</h1>
    <form action="../../managerServlet" method="post" style="text-align: center">
        <%
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
        %>

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
                <th><input type="text" name="id" value="1234"></th>
                <th><input type="text" name="name" value="张三"></th>
                <th><input type="text" name="grade" value="大二"></th>
                <th><input type="text" name="stuClass" value="软件12"></th>
                <th><input type="text" name="cScore" value="98"></th>
                <th><input type="text" name="javaScore" value="90"></th>
                <th><input type="text" name="cppScore" value="66"></th>
            </tr>
            </tbody>
        </table>
        <input type="hidden" name="status" value="add">
        <button type="submit" class="btn btn-primary">提交</button>
    </form>
</body>
</html>
