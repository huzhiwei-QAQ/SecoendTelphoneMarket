
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
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		url : "selectAllGoodsByajax",
		type : "post",
		success : function(data) {
			//显示所有入库商品型号
			for(var i=0;i<data.length;i++){
$('#type').append("<option value='"+data[i].g_type+"'>"+data[i].g_type+"</option>");
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
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
  <div class="container-fluid">

    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">商品出库(产品入库)管理</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/SecondTelephoneMarket/getindex">返回</a></li>
      </ul>
      
    </div>
  </div>
</nav>




<div class="row">
<div class="col-sm-6">
   <h2 class="title">
                        <span class="glyphicon glyphicon-bullhorn"></span> 产品库存
                    </h2>
 <table  class="table table-hover table-striped table-condensed"  background="/SecondTelephoneMarket/img/1.jpg">
                        <tbody>
                        	   <th>ID</th>
								<th>手机型号</th>
								<th>手机描述</th>
				
							    
								<th class="text-right">剩余数量</th>

                       <c:forEach items="${selectAll }" var="selectAll">
                            <tr>
                                <td ><a href="#" style="color: #4d86f6"> <c:out value=" ${selectAll.p_id}"></c:out></a></td>
                                  <td ><a href='<c:out value="${selectAll.p_url }"></c:out>' style="color: #4d86f6"> <c:out value="${selectAll.p_type }"></c:out></a></td>
                                    <td ><a href="#" style="color: #4d86f6"><c:out value="${selectAll.p_discription }"></c:out></a></td>
                                 
                                   
                                     <td class="text-right"><a href="#" style="color: #4d86f6"><c:out value="${selectAll.p_num }"></c:out></a></td> 

                            </tr>
              </c:forEach>
                        </tbody>
                    </table>
           </div>
         <div class="col-sm-6" >     
                <h2 class="title">
                        <span class="glyphicon glyphicon-bullhorn"></span> 商品库存
                    </h2>       
                    
                     <table  class="table table-hover table-striped table-condensed"  background="/SecondTelephoneMarket/img/1.jpg">
                        <tbody>
                        	   <th>ID</th>
								
								<th>手机型号</th>
					
							    <th>供销商</th>
							    <th>进价</th>
								<th class="text-right">剩余数量</th>

                       <c:forEach items="${selectAllGoods }" var="selectAllGoods">
                            <tr>
                                <td ><a href="#" style="color: #4d86f6"> <c:out value=" ${selectAllGoods.g_id}"></c:out></a></td>
                                  <td ><a href='<c:out value="#"></c:out>' style="color: #4d86f6"> <c:out value="${selectAllGoods.g_type }"></c:out></a></td>
                                    <td ><a href="#" style="color: #4d86f6"><c:out value="${selectAllGoods.g_discription }"></c:out></a></td>
                              <td ><a href="#" style="color: #4d86f6"><c:out value="${selectAllGoods.g_price }"></c:out></a></td>
                                   
                                     <td class="text-right"><a href="#" style="color: #4d86f6"><c:out value="${selectAllGoods.g_num }"></c:out></a></td> 

                            </tr>
              </c:forEach>
                        </tbody>
                    </table>
                    </div>     
                    </div>
                    
                       <form action="/SecondTelephoneMarket/goodsAndProduct" method="post">
		<div class=row>
			<div class=col-sm-3></div>
			<div class=col-sm-6>
				<div class="well">
					<div class="input-group">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">商品出库(产品入库)管理</button>
						</span>
						 <!-- <input type="text" class="form-control" placeholder="请选择手机型号:"name="type" > -->
						  <select type="text" class="form-control"  name="type"  id="type"><option value="" selected disabled style="display: none; ">请选择手机型号:</option></select>
						  <input type="text" class="form-control" placeholder="请确认数量:"name="num" >  
						<span class="input-group-btn">
							<button class="btn btn-default" type="submit"  onclick="test()">提交</button>
						</span>
					</div>
				</div>
			</div>
			<div class=col-sm-3></div>
		</div>

	 
</body>
</html>
</body>
</html>