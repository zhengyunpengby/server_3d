<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>3D木门-登录</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" href="login/css/style.css" />

<body>

<div class="login-container blur">
	<h1>3D木门</h1>
	
	<div class="connect">
		<p>淮滨代理商</p>
	</div>
	
	<form action="login.action"  method="post" id="loginForm">
		<div>
			<input type="text" name="loginMg" class="username" placeholder="用户名/手机号" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登 录</button>
	</form>

	<a href="regist.jsp">
		<button type="button" class="register-tis">还有没有账号？</button>
	</a>

</div>

<script src="login/js/jquery.min.js"></script>
<script src="login/js/common.js"></script>
<!--背景图片自动更换-->
<script src="login/js/supersized.3.2.7.min.js"></script>
<script src="login/js/supersized-init.js"></script>
<!--表单验证-->
<script src="login/js/jquery.validate.min.js?var1.14.0"></script>

</body>
</html>