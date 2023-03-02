<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Loner
  Date: 2021/11/27
  Time: 16:45
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
    <title>用户信息</title>
</head>
<body>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>邮箱</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.Users}" var="user">
                <tr>
                    <th>${user.id}</th>
                    <th>${user.username}</th>
                    <th>${user.password}</th>
                    <th>${user.email}</th>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
