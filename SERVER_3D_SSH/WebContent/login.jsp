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
<title>login</title>
</head>
<body>
	<div>
		<form action="login.action"  method="post">
			<label>姓名：</label>
			<input type="text" name="loginMg">
			<label>密码：</label>
			<input type="password" name="password">
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>