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
	<link rel="stylesheet" href="../css/comment.css" type="text/css" />
	<link rel="stylesheet" href="../css/listProduct.css" type="text/css" />
	 <c:forEach items="${maps }" var="map">
	 	<div id="product-container">
	 		<div id="image-container">
		 		<c:if test="${map.image_ID==null }">
					<img src="${basePath }image/loading.jpg"/>
				</c:if>
				<c:if test="${map.image_ID!=null}">
					<img src="${basePath }product/showImage.action?image_id=${map.image_ID }"/>
				</c:if>
			</div>
			<div>
				<table class="test">
					<tr>
						<td id="product_name" colspan="2">${map.product_name }</td>
					</tr>
					<tr>
						<td id="product_type">${map.product_type }</td>
						<td id="now_price">${map.now_price }</td>
					</tr>
					<tr>
						<td id="product_type">${map.product_type }</td>
						<td id="discount">${map.discount }</td>
					</tr>
				</table>
			</div>		
		</div>
	</c:forEach>
</body>