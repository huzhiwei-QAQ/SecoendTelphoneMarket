<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<link href="js/bootstrap.min.css" rel="stylesheet">
<link href="js/login.css" rel="stylesheet">
<link href="js/style.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">


function test() {
	alert("增加成功，两秒后跳转到首页");
}


$(document).ready(function(){
	$.ajax({
		url : "selectAllGoodsByajax",
		type : "post",
		success : function(data) {
			//显示所有商品的信息
			for(var i=0;i<data.length;i++){
$('#type').append("<option value='"+data[i].g_type+"'>"+data[i].g_type+"</option>");
}

		}
	});
	
	$.ajax({
		url : "selectAllSupplierByajax",
		type : "post",
		success : function(data) {
			//显示所有供应商的信息
			for(var i=0;i<data.length;i++){
$('#supplier').append("<option value='"+data[i].suppliers+"'>"+data[i].suppliers+"</option>");
}

		}
	});
	
})


var unSelected = "#999";
    var selected = "#333";
    $(function () {
        $("select").css("color", unSelected);
        $("option").css("color", selected);
        $("select").change(function () {
            var selItem = $(this).val();
            if (selItem == $(this).find('option:first').val()) {
                $(this).css("color", unSelected);
            } else {
                $(this).css("color", selected);
            }
        });
    })
</script>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">采购管理</a>
    </div>

   
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/SecondTelephoneMarket/getindex">返回</a></li>
      </ul>
      
    </div>
  </div>
</nav>
	<form action="/SecondTelephoneMarket/merchandiseorder" method="post">
		<div class=row>
			<div class=col-sm-3></div>
			<div class=col-sm-6>
				<div class="well">
					<div class="input-group">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">添加待采购单</button>
						</span>
			
							<select type="text" class="form-control"  name="type" id="type"> <option value="" selected disabled style="display: none;">请选择采购的手机型号:</option>  </select>
					
						<input type="text" class="form-control" placeholder="请输入你要采购的数量:" name="num" >
						<select type="text" class="form-control"  name="supplier"  id="supplier"><option value="" selected disabled style="display: none; ">请选择二手手机采购商:</option></select>
						
						<span class="input-group-btn">
							<button class="btn btn-default" type="submit"  onclick="test()">提交</button>
						</span>
					</div>
				</div>
			</div>
			<div class=col-sm-4></div>
		</div>
	</form>
</body>
</html>