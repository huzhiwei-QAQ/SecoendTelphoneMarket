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
<body>
<!-- <form action="/SecondTelephoneMarket/loginController" method="post">
请输入ID:<input type="text" name="id">
请输入姓名：<input type="text" name="username">
请输入密码：<input type="password" name="password"> -->



  <nav class="navbar navbar-default" 　role="navigation">
        <!--logo和移动设备展现折叠后点击的部分-->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">点击展开</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand " href="#">二手手机商城登录平台</a>
        </div>

        <!--能够折叠起来的部分-->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
             <li class="active">
                    <a href="i/NewsManage/Login.jsp">登录系统</a>
                </li>
                <li >
                    <a href="https://www.toutiao.com/ch/news_hot/">热门机型</a>
                </li>
                <li>
                    <a href="https://www.toutiao.com/">科技前沿</a>
                </li>
               <li>
                    <a href="prolist.html">限时折扣</a>
                </li>
                </ul>
        </div>

    </nav>






       <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
 <!--第一步：设计轮播图片的容器。-->

  <!--第二步：设计轮播图片计数器。-->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
    <li data-target="#carousel-example-generic" data-slide-to="5"></li>
    <li data-target="#carousel-example-generic" data-slide-to="6"></li>
    
  </ol>

  <!--第三步：设计轮播图片播放区,使用 carousel-inner 样式来控制-->
  <div class="carousel-inner" >
    <div class="item active">
      <img src="img/25.jpg" alt="加载">

     </div>
      <div class="item">
        <img src="img/23.jpg" alt="加载">
    
     </div>
    <div class="item">
       <img src="img/24.jpg" alt="加载">
    
    </div>
    <div class="item">
       <img src="img/26.jpg" alt="加载">
     
    </div>
    <div class="item">
       <img src="img/27.jpg" alt="加载">
   
    </div>
    <div class="item">
       <img src="img/28.jpg" alt="加载">
    </div>
    <div class="item">
       <img src="img/29.jpg" alt="加载">
    </div>
  </div>

 
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">&lsaquo;
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">&rsaquo;
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>



<form action="/SecondTelephoneMarket/login"  method="post">   <!--  提交到servlet,经行后台操作  -->
  <div class="container" id="content">
                <div class="row">
                      
                
            </div>
    <div class="loginbox  col-sm-4 col-sm-push-8">
                        <h2 class="title">员工登录</h2>
                        <div class="input-group">
                      
                            <span class="input-group-addon  glyphicon glyphicon-user"
                                id="basic-addon1"></span> <input type="text"
                                class="form-control" placeholder="请输入用户名"
                                aria-describedby="basic-addon1"  name="username">
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon  glyphicon glyphicon-eye-close"
                                id="basic-addon1"></span> <input type="password"
                                class="form-control" placeholder="请输入密码 "
                                aria-describedby="basic-addon1" name="password">
                        </div>
                  
         
                        <label for="remember"><input type="checkbox"name="remember" id="remember" value="true" /> 
                           &nbsp; 记 住 密 码</label>
                        <p>
                            <button type="submit">登录</button>  
                        </p>
                        <a href="#">新员工注册？</a>
                        <p>
                           <a class="btn btn-primary" href="/SecondTelephoneMarket/getaddNewUser" role="button">点击注册</a>
                    </div>
  </div>
  </form>
    <br>
        
  <div>        
   
 <h2 class="font-bold">Welcome to Login</h2>

                <p>
                    Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
                </p>

                <p>
                    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.
                </p>

                <p>
                    When an unknown printer took a galley of type and scrambled it to make a type specimen book.
                </p>

                <p>
                    <small>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</small>
                </p>
  
                </div>
  
  
 <div class="foot">
        <footer class="footer">
            <!--页脚设置-->
            <div class="loginfooter">
                <ul>
                    <li><a href="#">关于我们</a></li>
                    <li><a href="#">联系方式</a></li>
                    <li><a href="#">技术支持</a></li>
                    <li><a href="#">意见反馈</a></li>
                    <li><a href="#">帮助中心</a></li>

                </ul>
                <p></p>

            </div>
        </footer>
    </div>


</body>
</html>