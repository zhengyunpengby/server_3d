<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<link rel="stylesheet" href="css/comment.css" type="text/css" />
<title>regist</title>
</head>
<body>
	<div>
		<form action="regist.action" method="post">
			<ul>
				<li><label>姓名：</label><input name="customer.custName" type="text" maxlength="10"/></li>
				<li><label>证件号 ：</label><input name="customer.cert_ID" type="text" maxlength="18"/></li>
				<li><label>住址：</label><input name="customer.home_Address" type="text" maxlength="100"/></li>
				<li><label>工作类型：</label><input name="customer.work_Type" type="text" maxlength="100"/></li>
			</ul>

			<ul>
				<li><label>登录名：</label><input name="customer.userName" type="text" maxlength="14"/><a href="verifyInfoUserName.action?customer.userName=123">校验</a></li></li>
				<li><label>手机号：</label><input name="customer.tel" type="text" maxlength="14"/><a href="verifyInfoTel.action?customer.tel=123">校验</a></li>
				<li><label>密码：</label><input name="customer.password" type="password" maxlength="20"/></li>
				<li><label>确认密码：</label><input name="" type="password" maxlength="20"/></li>
			</ul>
				
			<div>
				<input type="submit" value="提交">
			</div>
		</form>
	</div>
</body>
</html>