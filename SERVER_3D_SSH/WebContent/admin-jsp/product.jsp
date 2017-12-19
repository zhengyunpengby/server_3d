<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<body>
	<script type="text/javascript">
	    function changeFrameHeight(){
	        var ifm= document.getElementById("product-iframe"); 
	        //ifm.height=ifm.contentWindow.document.body.scrollHeight;
	    }
	
	    window.onresize=function(){  
	         changeFrameHeight();
	    } 
	</script>
	<link rel="stylesheet" href="../css/comment.css" type="text/css" />
	<link rel="stylesheet" href="../css/product.css" type="text/css" />
	
	<div id="product-manager" class="">
		<div id="product-manager-list"  class="">
			<ul  class="">
				<li><a href="../product/listProducts.action" target="product-iframe">产品列表</a></li>
				<li><a href="product/loadProduct.jsp" target="product-iframe">录入产品</a></li>
				<li><a href="product/upImageProduct.jsp" target="product-iframe">上传图片</a></li>
				<li><a href="product/updateProduct.jsp" target="product-iframe">修改产品</a></li>
			</ul>
		</div>
		<div id="product-manager-fact" class="">
			<iframe  name="product-iframe"
			id="product-iframe" scrolling="no" onload="changeFrameHeight()" frameborder="0" width="100%" height="1650px"
			src="../product/listProducts.action"></iframe>
		</div>
	</div>
</body>