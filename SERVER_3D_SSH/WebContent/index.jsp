<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="0">
<link rel="stylesheet" href="css/comment.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<script type="text/javascript">
    function changeFrameHeight(){
        var ifm= document.getElementById("myiframe"); 
        ifm.height=ifm.contentWindow.document.body.scrollHeight;
    }

    window.onresize=function(){  
         changeFrameHeight();
    } 
</script>
<title>3D木门</title>
</head>

<body>
	<div id="header" >
		<span id="title" class="">3D木门</span>		
		<s:if test="#session.customer==null">
			<div id="load" class="">
				<ul id="load-ul" class="">
					<li class="load-cl">
						<a href="regist.jsp" title="注册">注册</a>
					</li>
					<li id="load-ul-load" class="load-cl">
						<a href="login.jsp" title="登录">登录</a>					
					</li>
				</ul>
			</div>
		</s:if>
		<s:else>
			<div id="load" class="">
				<ul id="load-ul" class="">
					<li class="load-cl">
						<a href="logout.action" title="退出">退出</a>
					</li>
					<li id="load-ul-success" class="load-cl">
						欢迎<a href="login.jsp" title="详细信息"> ${customer.userName} </a>			
					</li>
				</ul>
			</div>
		</s:else>
	</div>
	<div id="menuer" class="">
		<ul>
			<li id="menu-selected" class="menuer-ul-li"><a href="">首页</a></li>
			<li class="menuer-ul-li"><a href="">产品展示</a></li>
			<li class="menuer-ul-li"><a href="">装潢案例</a></li>
			<li class="menuer-ul-li"><a href="">拓展业务</a></li>
			<li class="menuer-ul-li"><a href="">联系我们</a></li>
		</ul>
	</div>
	<div id="conter" class="">
		<iframe  
			id="myiframe" scrolling="no" onload="changeFrameHeight()" frameborder="0" width="100%"
			src="cust-jsp/main.jsp"></iframe>
	</div>
	<div id="fooder" class="gradient">
		版权所有 © 2017 淮滨3D木门
	</div>
</body>
</html>