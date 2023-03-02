<%--
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
    <title>删除学生信息</title>
</head>
<body>
    <h1 style="text-align: center">请输入需要删除的学生学号</h1>
        <form action="../../managerServlet" method="post" style="text-align: center">
            <input type="text" name="id" placeholder="请输入学生学号">
            <input type="hidden" name="status" value="delete">
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
</body>
</html>
