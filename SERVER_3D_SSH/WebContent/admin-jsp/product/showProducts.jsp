<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath",basePath);
%>
<body>
	<form action="${basePath }product/addProduct.action" method="post">
		<ul>
			<li><label>产品名：</label><input type="text" name="product.product_name"></li>
			<li><label>产品类型：</label><input type="text" name="product.product_type"></li>
			<li><label>价格：</label><input type="text" name="product.now_price"></li>
			<li><label>折扣：</label><input type="text" name="product"></li>
			<li><input type="submit" name="提交"></li>
		</ul>
	</form>
</body>