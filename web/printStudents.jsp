<%@ page import="com.citsoft.pojo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Loner
  Date: 2021/12/20
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>学生列表</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/examples/dashboard/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="loginsuccess.jsp">学生成绩管理系统</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">所有学生 <span class="sr-only">(current)</span></a></li>
                <li>
                    <a href="Page/Manager/addStudent.jsp">
                        增加学生信息
                    </a>
                </li>
                <li>
                    <a href="Page/Manager/deleteStudent.jsp">
                        删除学生信息
                    </a>
                </li>
            </ul>
        </div>

        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h2 class="sub-header" style="text-align: center;">学生列表</h2>
            <form action="managerServlet" method="post" style="text-align: center;">
                <input type="text" name="stuID" placeholder="请输入学生学号" class="form-search">
                <button name="status" value="query" class="btn">查询学生信息</button>
            </form>
            <div class="table-responsive">
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
                    <c:forEach items="${requestScope.Students}" var="student">
                        <tr>
                            <th>${student.id}</th>
                            <th>${student.name}</th>
                            <th>${student.grade}</th>
                            <th>${student.stuClass}</th>
                            <th>${student.cScore}</th>
                            <th>${student.javaScore}</th>
                            <th>${student.cppScore}</th>
                            <th>${student.totalScore}</th>
                            <th>
                                <form action="Page/Manager/updateStudent.jsp" method="post">
                                    <input type="hidden" name="id" value = "${student.id}">
                                    <button name="status" value="update" class="btn btn-success">修改学生信息</button>
                                </form>
                            </th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/js/vendor/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.29/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>




<%--<html>--%>
<%--<head>--%>
<%--    <title>学生信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--    <table border="1">--%>
<%--        <tr>--%>
<%--            <td>学号</td>--%>
<%--            <td>姓名</td>--%>
<%--            <td>年级</td>--%>
<%--            <td>班级</td>--%>
<%--            <td>C语言成绩</td>--%>
<%--            <td>java成绩</td>--%>
<%--            <td>c++成绩</td>--%>
<%--            <td>总分</td>--%>
<%--            <td>操作</td>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${requestScope.Students}" var="student">--%>
<%--            <tr>--%>
<%--                <td>${student.id}</td>--%>
<%--                <td>${student.name}</td>--%>
<%--                <td>${student.grade}</td>--%>
<%--                <td>${student.stuClass}</td>--%>
<%--                <td>${student.cScore}</td>--%>
<%--                <td>${student.javaScore}</td>--%>
<%--                <td>${student.cppScore}</td>--%>
<%--                <td>${student.totalScore}</td>--%>
<%--                <td>--%>
<%--                    <form action="Page/Manager/updateStudent.jsp" method="post">--%>
<%--                        <input type="hidden" name="id" value = "${student.id}">--%>
<%--                        <button name="status" value="update">修改学生信息</button>--%>
<%--                    </form>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>

<%--    <form action="managerServlet" method="post">--%>
<%--        <input type="text" name="stuID">--%>
<%--        <button name="status" value="query">查询学生信息</button>--%>
<%--    </form>--%>

<%--    <form action="Page/Manager/deleteStudent.jsp">--%>
<%--        <button name="status" value="delete">删除学生信息</button>--%>
<%--    </form>--%>

<%--    <form action="Page/Manager/addStudent.jsp">--%>
<%--        <button name="status" value="add">增加学生信息</button>--%>
<%--    </form>--%>

<%--</body>--%>
<%--</html>--%>
