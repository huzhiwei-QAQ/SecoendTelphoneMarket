package com.hqyj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.entity.Notice;
import com.hqyj.service.NoticeService;
import com.hqyj.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private NoticeService noticeService;

//登录
@RequestMapping(value="/login",method=RequestMethod.POST)
public String cheakUser(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
	req.setCharacterEncoding("utf-8");
	resp.setContentType("text/html;charset=utf-8");
	
	//拿到页面输入用户名和密码
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	if(username==null || username.equals("")||password==null || password.equals("") ){
		return "用户名或密码不能为空！";
	}else {
		//进行shiro认证
		
		//1.拿到当前对象
		Subject subject = SecurityUtils.getSubject();
	     //将用户名保存在session
		subject.getSession().setAttribute("USERNAME", username);
		
		//2.判断用户是否被认证
		if(!subject.isAuthenticated()){
			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
			//设置remember
			token.setRememberMe(true);
			
			//shiro登录验证
			try {
				subject.login(token);
				//登录成功的操作
				System.out.println("登录成功！");
			
				
		//开始分页查询	只查询第一页	
				//引入pagehelper分页插件 ，传入页码以及页码大小
				PageHelper.startPage(1,5);
				//查询信息
				List<Notice> selectAllNotice = noticeService.selectAllNotice();
				System.out.println("查询的信息"+selectAllNotice);
				//使用pageinfo包装查询结果,并传入连续显示的页数
				PageInfo pageInfo=new PageInfo(selectAllNotice,5);	
				System.out.println(pageInfo);
				req.setAttribute("pageInfo", pageInfo);
				return "success";
			
			} catch (AuthenticationException e) {
				//登录失败进行的操作
				return "用户名或者密码错误！";
			}
		}

	}
	return password;
}	
//退出登录
@RequestMapping(value="/loginOut",method=RequestMethod.GET)	
public void loginOut(HttpServletRequest req,HttpServletResponse resp) throws IOException{
	Subject subject = SecurityUtils.getSubject();
	subject.logout();
	resp.sendRedirect("login.jsp");
}
}
