<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="author" content="Kodinger">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>用户注册</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/my-login.css">
	<script type="text/javascript" src="script/jquery-1.7.2.js"></script>
	<style>
		.errorMsg{
			color: red;
			font-size: large;
		}
	</style>
	<script type="text/javascript">
		$(function (){
			//验证用户信息是否可用
			$("#sub_btn").click(function (){
				//验证用户名:必须由数字，字母，下划线组成，且长度为5到12
				var usernameText = $("#username").val();
				var usernamePatt = /^\w{5,12}$/;
				if(!usernamePatt.test(usernameText)) {
					$("Span.errorMsg").text("用户名输入不规范！！！必须由数字，字母，下划线组成，且长度为5到12");
					return false;
				}
				$("Span.errorMsg").text();

				//验证密码:必须由数字，字母，下划线组成，且长度为5到12
				var pwdText = $("#password").val();
				var pwdPatt = /^\w{5,12}$/;
				if(!pwdPatt.test(pwdText)) {
					$("Span.errorMsg").text("密码输入不规范！！！必须由数字，字母，下划线组成，且长度为5到12");
					return false;
				}
				$("Span.errorMsg").text();

				//验证确认密码
				var repwdText = $("#repassword").val();
				var repwdPatt = pwdText;
				if(repwdText != pwdText) {
					$("Span.errorMsg").text("密码与确认密码有误,请重新输入");
					return false;
				}
				$("Span.errorMsg").text();

				//验证邮箱
				var emailText = $("#email").val();
				var emailPatt = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
				if(!emailPatt.test(emailText)) {
					$("Span.errorMsg").text("邮箱有误,请重新输入");
					return false;
				}
				$("#Span.errorMsg").text();
			})
		})
	</script>
</head>
<body class="my-login-page">
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-md-center h-100">
				<div class="card-wrapper">
					<h1>&nbsp&nbsp&nbsp学生成绩管理系统</h1>
					<div class="brand">
						<img src="img/logo2.jpg" alt="bootstrap 4 login page">
					</div>
					<div class="card fat">
						<div class="card-body">
							<h4 class="card-title">用户注册</h4>
							<span class="errorMsg"></span>
							<form method="post" class="my-login-validation" novalidate="" action="registServlet">
								<div class="form-group">
									<label for="username">用户名</label>
									<input id="username" type="text" class="form-control" name="username" required autofocus
										   value="admin">
								</div>

								<div class="form-group">
									<label for="password">密码</label>
									<input id="password" type="password" class="form-control" name="password" required data-eye
									value="admin">
									<div class="invalid-feedback">
										Password is required
									</div>
								</div>

								<div class="form-group">
									<label for="repassword">确认密码</label>
									<input id="repassword" type="password" class="form-control" name="repassword" required data-eye
									value="admin">
								</div>


								<div class="form-group">
									<label for="email">邮箱</label>
									<input id="email" type="email" class="form-control" name="email" required
									value="admin@qq.com">
									<div class="invalid-feedback">
										Your email is invalid
									</div>
								</div>
								<div class="form-group m-0">
									<button type="submit" class="btn btn-primary btn-block" id="sub_btn">
										注册
									</button>
								</div>
							</form>
						</div>
					</div>
					<div class="footer">
						made by han
					</div>
				</div>
			</div>
		</div>
	</section>

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		<script src="js/my-login.js"></script>
</body>
</html>