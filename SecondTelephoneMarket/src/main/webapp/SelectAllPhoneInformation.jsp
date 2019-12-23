
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
      <ul class="nav navbar-nav navbar-right">
        <li><a href="/SecondTelephoneMarket/getindex">返回</a></li>
      </ul>
      
    </div>
  </div>
</nav>
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