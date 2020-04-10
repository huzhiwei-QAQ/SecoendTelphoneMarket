<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>密码找回</title>
  <meta name="description" content="mobile first, app, web app, responsive, admin dashboard, flat, flat ui">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"> 
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/style.css">
<script type="text/javascript"  src="js/jquery-1.11.3.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		username=$("#username").val();
		email=$("#email").val();
		alert("你输入的姓名为:"+username+"\n"+"你输入的邮箱为:"+email);
		$.ajax({
			url:"getverificationCode",
			type:"post",
			dataType:"json",
			data:{"username":username,
				    "email":email},
			success:function(data){
				var num = eval(data);
				if(num==1){
					alert("验证码发送成功，请注意查收邮箱");
				}else if(num==0){
					alert("验证码发送失败，请核对姓名和邮箱");
				}
         	}	    
			});
				
		});
		
	});
	
	



</script>

  <body>
  <!-- header -->
  <header id="header" class="navbar bg bg-black">
    
    <a class="navbar-brand" href="#">密码找回</a>
  </header>
  <!-- / header -->
  <section id="content">
    <div class="main padder">
      <div class="row">
        <div class="col-lg-4 col-offset-4 m-t-large">
          <section class="panel">
            <header class="panel-heading text-center">
              密码找回
            </header>
            <form action="/SecondTelephoneMarket/getnewPassWordPage" class="padder" method="post">
                <div class="block">
                <label class="control-label">姓名</label>
                <input type="text" id="username" placeholder="姓名" class="form-control" name="username">
              </div>
              <div class="block">
                <label class="control-label">邮箱</label>
                <input type="email" id="email" placeholder="邮箱" class="form-control" name="email">
              </div>
              <div class="block">
                <label class="control-label">验证码</label>
                <input type="text" id="VerificationCode" placeholder="验证码" class="form-control" name="VerificationCode">
              </div>
              <div class="row">
             <div class="col-sm-3">
              <button type="button" class="btn btn-info" id="btn1">获取验证码</button>
              </div>
              <div class="col-sm-6"></div>
              <div class="col-sm-3">
               <button type="submit" class="btn btn-info"  >确定</button>
                 </div>
               </div>
               
              <div class="line line-dashed"></div>
              <a href="#" class="btn btn-facebook btn-block m-b-small"><i class="icon-facebook pull-left"></i>Sign in with Facebook</a>
              <a href="#" class="btn btn-twitter btn-block"><i class="icon-twitter pull-left"></i>Sign in with Twitter</a>
              <div class="line line-dashed"></div>
              <p class="text-muted text-center"><small>Do not have an account?</small></p>
              <a href="signup.html" class="btn btn-white btn-block">Create an account</a>
            </form>
          </section>
        </div>
      </div>
    </div>
  </section>
  <!-- footer -->
  <footer id="footer">
    <div class="text-center padder clearfix">
      <p>
        <small>© first 2013, Mobile first web app framework base on Bootstrap</small><br><br>
        <a href="#" class="btn btn-mini btn-circle btn-twitter"><i class="icon-twitter"></i></a>
        <a href="#" class="btn btn-mini btn-circle btn-facebook"><i class="icon-facebook"></i></a>
        <a href="#" class="btn btn-mini btn-circle btn-gplus"><i class="icon-google-plus"></i></a>
      </p>
    </div>
  </footer>
  <!-- / footer -->


</body>


</html>