
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
         <%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
 <fmt:requestEncoding value="utf-8"  />
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://shiro.apache.org/tags"  prefix="shiro"%>
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
<script type="text/javascript"  src="js/jquery-1.11.3.min.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">




function doUpload() {

	var formData = new FormData($("#uploadForm")[0]);//构造FormData对象
	alert("上传成功");
	$.ajax({
		url : 'addtelphone',//接受请求的Servlet地址
		type : 'POST',
		data : formData,
		async : false,//同步请求
		cache : false,//不缓存页面
		contentType : false,//当form以multipart/form-data方式上传文件时，需要设置为false
		processData : false,//如果要发送Dom树信息或其他不需要转换的信息，请设置为false
		success : function(data) {
			$("#img_test").attr('src', data);//上传成功后，把服务器获取到的图片路径绑定到img标签是src属性上
		}
	});
}



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
      <a class="navbar-brand" href="#">在售手机信息查询</a>
    </div>

   
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav" >
   <li><a  data-toggle="modal" href="#myModal"  >增加手机型号</a></li>
   <li><a  data-toggle="modal" href="#myModal2"  >修改手机信息</a></li>
    </ul>
    
    
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/SecondTelephoneMarket/getindex">返回</a></li>
      </ul>
      
    </div>
  </div>
</nav>

     <!--模态框  -->
          <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
     <form id="uploadForm" enctype="multipart/form-data" method="post">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title">增加手机型号</h4>
      </div>
      <div class="modal-body">

     <p><div class="input-group">
       <span class="input-group-btn">手机型号：</span>
      <input type="text" class="form-control"  placeholder="请输入手机型号"  id="type" name="type"></div></p>
       <p><div class="input-group">
       <span class="input-group-btn">供应商：</span>
      <input type="text" class="form-control"  placeholder="请输入二手手机供应商"  id="supplier" name="supplier"></div></p>
      <p><div class="input-group">
      <span class="input-group-btn">采购价：</span>
      <input type="text" class="form-control"  placeholder="请输入手机采购价"  id="purchaseprice" name="purchaseprice"></div></p>
      <p><div class="input-group">
      <span class="input-group-btn">出售价：</span>
      <input type="text" class="form-control"  placeholder="请输入手机出售价"  id="sellingprice" name="sellingprice"></div></p>
      <p><div class="input-group">
      <span class="input-group-btn">出售手机的成色：</span>
      <input type="text" class="form-control"  placeholder="出售手机的成色"  id="discription" name="discription"></div></p>

    <button type="button" class="btn btn-primary" id="btn1">上传手机图片</button>
    <br>
		 <input type="file" name="file" id="file" class="imgInput" />
		<input type="button" value="增加" onclick="doUpload()" />
		
	</form>
      </div>

      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
      </div>
    </div>
  </div>
</div>


   <h2 class="title">
                        <span class="glyphicon glyphicon-bullhorn"></span> 手机信息
                    </h2>
 <table  class="table table-hover table-striped table-condensed table-bordered" >
                        <tbody>
                        	   <th class="text-center">ID</th>
								<th class="text-center">手机型号</th>
								<th class="text-center">供应商</th>
					        <th class="text-center">采购价</th>
							  <th class="text-center">出售价</th>  
							    <th class="text-center">手机描述</th> 
								<th class="text-center">图片</th>

         <c:forEach items="${selectAllNewResources }" var="selectAllNewResources">
         
                            <tr   >
                                <td style="text-align:center;vertical-align:middle;"><a href="#" style="color: #4d86f6"> <c:out value=" ${selectAllNewResources.id}"></c:out></a></td>
                                <td style="text-align:center;vertical-align:middle;"><a href='<c:out value="#"></c:out>' style="color: #4d86f6"> <c:out value="${selectAllNewResources.type }"></c:out></a></td>
                               <td style="text-align:center;vertical-align:middle;"><a href="#" style="color: #4d86f6"><c:out value="${selectAllNewResources.supplier }"></c:out></a></td>
                              <td style="text-align:center;vertical-align:middle;"><a href="#" style="color: #4d86f6"><c:out value="${selectAllNewResources.purchasePrice }"></c:out></a></td>
                              <td style="text-align:center;vertical-align:middle;"><a href="#" style="color: #4d86f6"><c:out value="${selectAllNewResources.sellingPrice }"></c:out></a></td>
                              <td style="text-align:center;vertical-align:middle;"><a href="#" style="color: #4d86f6"><c:out value="${selectAllNewResources.discription }"></c:out></a></td>
                             <td style="text-align:center;vertical-align:middle;">  <img id="images" alt="" src="<c:out value="${selectAllNewResources.path }" ></c:out>" width="100" height="100"></td> 

                            </tr>
              </c:forEach> 
                        </tbody>
                    </table>
                          
</body>
</html>
</body>
</html>