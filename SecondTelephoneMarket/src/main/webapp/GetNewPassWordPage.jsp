<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>重制密码</title>
  <meta name="description" content="mobile first, app, web app, responsive, admin dashboard, flat, flat ui">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"> 
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/style.css">
<script type="text/javascript"  src="js/jquery-1.11.3.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
function test(){
  p1=$("#password").val();
  p2=$("#password2").val();

	if(p1==p2){
		alert("修改成功，两秒后跳转到首页");
		/*使用fun提交表单  */
		document.myform.submit();
	}else if(p1!=p2){
		alert("两次输入不一致，请重新输入");
		return false;
	}
}
</script>
<body>
<!-- header -->
  <header id="header" class="navbar bg bg-black">
    
    <a class="navbar-brand" href="#">重制密码</a>
  </header>
  <!-- / header -->
  <section id="content">
    <div class="main padder">
      <div class="row">
        <div class="col-lg-4 col-offset-4 m-t-large">
          <section class="panel">
            <header class="panel-heading text-center">
              重制密码
            </header>
            <form action="/SecondTelephoneMarket/setnewPassWord" class="padder" method="post" name="myform" >
                <div class="block">
                <label class="control-label">新密码</label>
                <input type="password" id="password" placeholder="请输入您的新密码" class="form-control" name="password">
              </div>
              <div class="block">
                <label class="control-label">再次确认</label>
                <input type="password" id="password2" placeholder="请确认您的新密码" class="form-control" name="password2">
              </div>
              
              <div class="row">
             <div class="col-sm-3">
              
              </div>
              <div class="col-sm-6"></div>
              <div class="col-sm-3">
               <button type="button" class="btn btn-info"  onclick="test()">确定</button>
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