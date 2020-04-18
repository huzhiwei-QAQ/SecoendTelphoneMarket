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
$(function(){
	$("#btn1").click(function(){
		types=$("#type1").val();
		alert("你输入的型号为"+types);
		  var saveDataAry=[];  
		var data1={"type":types};
		saveDataAry.push(data1);
		$.ajax({
			url:"selectpurchasestatement",
			type:"post",
		    dataType:"json",
		    contentType:"application/json;charset=UTF-8",
		    data:JSON.stringify(data1),
			success:function(data){				
$("#div1").append("采购型号:"+data.type+"  采购价:"+data.price+"  总采购数:"+data.num+"  该机型总采购结款:"+data.priceall+"<br>");
			}    
		});
	});
	
	
	
	$("#btn2").click(function(){
		$.ajax({
			url:"selectcount1",
			type:"post",
		    dataType:"json",    
			success:function(data){				
$("#div2").append("所有机型总采购结款:"+data.price+"<br>");
			}    
		});
	});
	
	
	
	$("#btn3").click(function(){
		types=$("#type2").val();
		alert("你输入的型号为"+types);
		
		$.ajax({
			url:"selectsalespayment",
			type:"post",
		    dataType:"json",
		    data:{"types":types},
			success:function(data){				
$("#div3").append("销售型号:"+data.type+"  销售价:"+data.price+"  总销售数:"+data.num+"  该机型总销售结款:"+data.priceall+"<br>");
			}    
		});
	});
	
	
	$("#btn4").click(function(){
		$.ajax({
			url:"selectcount2",
			type:"post",
		    dataType:"json",    
			success:function(data){				
$("#div4").append("所有机型总销售结款:"+data.price+"<br>");
			}    
		});
	});
	
});

</script>

<body>


<!-- 导航栏 -->
 <nav class="navbar navbar-default" 　role="navigation">
        <!--logo和移动设备展现折叠后点击的部分-->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">点击展开</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
         
            <a class="navbar-brand " href="login.html"">二手手机商城管理平台</a>
        </div>

        <!--能够折叠起来的部分-->
        <div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav" >
                <li class="active" >
                    <a href="index.html">首页</a>
                </li>
       <li ="dropdown">
                   <shiro:hasRole name="基础信息管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">基础信息管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="/SecondTelephoneMarket/getGoods">商品(采购)信息</a></li>
          <li><a href="/SecondTelephoneMarket/getProduct">产品信息</a></li>
          <li><a href="/SecondTelephoneMarket/getSupplier">供应商信息</a></li>
          <li><a href="/SecondTelephoneMarket/getCustomer">客户信息</a></li>
          
        </ul>
</shiro:hasRole>
                </li>
                
               <li ="dropdown">
                   <shiro:hasRole name="销售管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">销售管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="/SecondTelephoneMarket/intoorder">销售管理</a></li>
          <li><a href="/SecondTelephoneMarket/selectOrders">待销售订单</a></li>
          <li><a href="/SecondTelephoneMarket/selectAllProductsaled">销售统计查询</a></li>
        </ul>
</shiro:hasRole>
                </li>
                
                            <li ="dropdown">
                   <shiro:hasRole name="库存管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">库存管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="/SecondTelephoneMarket/getaddwarehousing">商品(采购)入库管理</a></li>
          <li><a href="/SecondTelephoneMarket/getGoodsAndproduct">商品出库(产品入库)管理</a></li>
          <li><a href="/SecondTelephoneMarket/GetGoodsExportedManage">产品出库管理</a></li>
          <li><a href="/SecondTelephoneMarket/GetGoodsAndProduct">库存统计查询</a></li>
        </ul>
</shiro:hasRole>
                </li>
                
                <li ="dropdown">
                   <shiro:hasRole name="采购管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">采购管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="/SecondTelephoneMarket/getPurchaseorders">采购管理</a></li>
                <li><a href="/SecondTelephoneMarket/selectPurchaseorder">待采购订单</a></li>
          <li><a href="/SecondTelephoneMarket/selectAllGoodsstatistics">采购统计查询</a></li>
        </ul>
</shiro:hasRole>
                </li>
                
                           <li ="dropdown">
                   <shiro:hasRole name="订单管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">订单管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="/SecondTelephoneMarket/orderManage">订单管理</a></li>
          <li><a href="/SecondTelephoneMarket/selectAllorder">订单查询</a></li>
        </ul>
</shiro:hasRole>
                </li>
                
                                            <li ="dropdown">
                   <shiro:hasRole name="往来核算管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">往来核算管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a  data-toggle="modal" href="#myModal"  >采购结款单</a></li>
            <li><a  data-toggle="modal" href="#myModal2"  >销售结款单</a></li>
        </ul>
</shiro:hasRole>
                </li>
                
                 <li ="dropdown">
                   <shiro:hasRole name="员工管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">员工管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a   href="/SecondTelephoneMarket/selectallnewuser"  >员工注册管理</a></li>
            <li><a href="/SecondTelephoneMarket/selectallUser"  >查看员工信息</a></li>
             <li><a href="/SecondTelephoneMarket/getUserInformationmanage"  >员工信息管理</a></li>
        </ul>
</shiro:hasRole>
                </li> 
                
                <li ="dropdown">
                   <shiro:hasRole name="资源管理">
<a href="#" class="dropdown-toggle" data-toggle="dropdown">资源管理 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a   href="/SecondTelephoneMarket/selectallPhoneInformation"  >在售手机信息查询</a></li>
            <li><a href="/SecondTelephoneMarket/getTelphonemanage"  >手机管理</a></li>

        </ul>
</shiro:hasRole>
                </li>     
                
           <li><a href="loginOut">退出登录</a> </li>    
               
           </ul>          
       </div>
       </div>
   </nav>
   
     <!--模态框  -->
          <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title">采购结款查询</h4>
      </div>
      <div class="modal-body">

     <p><div class="input-group">
       <span class="input-group-btn">采购的手机型号：</span>
      <input type="text" class="form-control"  placeholder="请输入手机型号"  id="type1" name="type1"></div></p>
    <button type="button" class="btn btn-primary" id="btn1">搜索</button>
    <br>
      <button type="button" class="btn btn-default">以下是该手机的采购结款信息</button>
      <div class="well" id="div1">     
      </div>
      <br>
       <button type="button" class="btn btn-primary" id="btn2">查询所有采购结款</button>
        <br>
      <button type="button" class="btn btn-default">以下是所有手机总采购结款信息</button>
      <div class="well" id="div2">     
      </div>
      </div>
      
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
      </div>
    </div>
  </div>
</div>



<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title">销售结款查询</h4>
      </div>
      <div class="modal-body">

     <p><div class="input-group">
       <span class="input-group-btn">销售的手机型号：</span>
      <input type="text" class="form-control"  placeholder="请输入手机型号"  id="type2" name="type2"></div></p>
    <button type="button" class="btn btn-primary" id="btn3">搜索</button>
    <br>
      <button type="button" class="btn btn-default">以下是该手机的销售结款信息</button>
      <div class="well" id="div3">     
      </div>
      <br>
       <button type="button" class="btn btn-primary" id="btn4">查询所有销售结款</button>
        <br>
      <button type="button" class="btn btn-default">以下是所有手机总销售结款信息</button>
      <div class="well" id="div4">     
      </div>
      </div>
      
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
      </div>
    </div>
  </div>
</div>
      

  
   
<section>
    <div class="banner">
        <div class="bannermsg container">
            <span class="weclome">中午好</span>
            &nbsp;&nbsp;
            <span class="notice">加油！！！</span>
        </div>
    </div>
</section>



<div class="row" >
<div class="col-sm-4"></div>
<div  class="col-sm-4">
<h5 >
  <span class="glyphicon glyphicon-bullhorn"></span> <a href="index.html"> 首页</a>/手机上架公告
  </h5>
<div class="well">
   <div class="input-group">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button">关键字</button>
      </span>
      <input type="text" class="form-control"  placeholder="请输入关键字">
      <span class="input-group-btn">
        <button class="btn btn-default" type="button">搜索</button>
      </span>
   </div>
</div>
</div>
<div class="col-sm-4"></div>
</div>

<div class="col-sm-2"></div>

<div class="col-sm-8">
<h2 class="title">
<span class="glyphicon glyphicon-bullhorn"></span>
 <span class="pull-left">公告标题</span> 
 <span class="pull-right"> 发表时间</span>
                    </h2>
                    <table class="table table-hover table-striped table-condensed">
                        <tbody>
              <c:forEach items="${pageInfo.list }" var="page">
                            <tr>               
                                  <td ><a href='<c:out value="${page.url }"></c:out>' style="color: #4d86f6"> <c:out value="${page.notices }"></c:out></a></td>
                                     <td class="text-right"><a href="#" style="color: #4d86f6"><c:out value="${page.time }"></c:out></a></td> 

                            </tr>
              </c:forEach>
                          
                   
                        </tbody>
                    </table>
                    

  </div>        

  
  <div class="col-sm-2"></div>  

  <div align="center">       
 
 <ul class="pagination">
  <li><a href="/SecondTelephoneMarket/selectAllNotices?page=1">首页</a></li>
  <li><a href="/SecondTelephoneMarket/selectAllNotices?page=${pageInfo.pageNum-1}">&laquo;</a></li>
    <c:forEach items="${pageInfo.navigatepageNums }" var="page">
    <c:if test="${page==pageInfo.pageNum }">
     <li class="active"><a href="#"><c:out value="${page}"></c:out></a></li>
     </c:if>
     <c:if test="${page!=pageInfo.pageNum }">
      <li ><a href="/SecondTelephoneMarket/selectAllNotices?page=${page}"><c:out value="${page}"></c:out></a></li>
      </c:if>
    </c:forEach>
  <li><a href="/SecondTelephoneMarket/selectAllNotices?page=${pageInfo.pageNum+1}">&raquo;</a></li>
    <li><a href="/SecondTelephoneMarket/selectAllNotices?page=${pageInfo.pages }">末页</a></li>
</ul>

</div>

<div align="center">
当前第${pageInfo.pageNum}页,总共${pageInfo.pages}页,总共${pageInfo.total}条记录

</div>

</body>
</html>