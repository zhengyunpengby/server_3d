<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<body>
<link href="../../upload/index_data/common.css" type="text/css" rel="stylesheet">
<link href="../../upload/index_data/index.css" type="text/css" rel="stylesheet">
<script src="../../upload/index_data/jquery.js"></script>
<script src="../../upload/index_data/imgUp.js"></script>

 <form action="../../upLoadProductImages.action" method="post" enctype="multipart/form-data" >
<div class="img-box full">
	<section class=" img-section">
		<p class="up-p"><span class="up-span">最多可以上传5张图片，马上上传</span></p>
		<div class="z_photo upimg-div clear">
				 <section class="z_file fl">
					<img src="../../upload/index_data/a11.png" class="add-img">
					<input name="upload" id="file" class="file" value="" accept="image/jpg,image/jpeg,image/png,image/bmp" multiple="" type="file">
				 </section>
		 </div>
	 </section>
</div>
<aside class="mask works-mask"style="display: none;">
	<div class="mask-content">
		<p class="del-p ">您确定要删除作品图片吗？</p>
		<p class="check-p"><span class="del-com wsdel-ok">确定</span><span class="wsdel-no">取消</span></p>
	</div>
</aside>
<input type="submit" value="提交">
<!-- <button id="up_images" onclick="up_images()">提交</button>
<script>
	function up_images(){
		alert(document.getElementById("file").files);
		var objs = document.getElementById("file").files;
		
		var arr = [];
		for (var n in objs) {
		    arr.push(n+"="+objs[n]);
		}
		alert(arr.join("&"));
	}
</script> -->
</form>
</body>