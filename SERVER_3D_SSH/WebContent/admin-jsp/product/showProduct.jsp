<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("basePath",basePath);
%>

<body>
	${product.product_name }<br/>
	${product.product_type }<br/>
	${product.now_price }<br/>
	${product.discount }<br/>
	<a href="../admin-jsp/product/upImageProduct.jsp?product=${product }">修改</a>
	${map }
	<c:forEach  var="image" items="${map.images }">
		<img src="${basePath }product/showImage.action?image_id=${image.image_ID }"/>
	</c:forEach>	
	<!-- <img src="data:image/jpg;base64,"> -->

	<s:debug/>
</body>