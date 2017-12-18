<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>3D木门-注册</title>
<link rel="stylesheet" href="login/css/style.css" />
<body>

<div class="register-container blur">
	<h1>3D木门</h1>
	
	<div class="connect">
		<p>淮滨代理商</p>
	</div>
	
	<form action="regist.action" method="post" id="registerForm">
		<div>
			<input type="text" name="customer.userName" class="username" placeholder="您的用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="customer.password" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="customer.tel" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
		</div>
		<div>
			<input type="text" name="customer.custName" class="custname" placeholder="您的姓名" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="customer.cert_ID" class="certid" placeholder="证件号" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="customer.home_Address" class="homeaddress" placeholder="家庭住址" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="customer.work_Type" class="worktype" placeholder="工作类型" oncontextmenu="return false" onpaste="return false" />
		</div>

		<button id="submit" type="submit">注 册</button>
	</form>
	<a href="login.jsp">
		<button type="button" class="register-tis">已经有账号？</button>
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