package com.huzhiwei.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mockito.internal.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.util.StringUtils;

@Controller

public class HelloController {
@RequestMapping(value="/hello",method=RequestMethod.GET)

	 public String sayHelloWorld(){
		return "login";
		 
	 }
/*@RequestMapping(value="/chatpage",method=RequestMethod.POST)*/
@PostMapping(value="/chatpage")
	public String getChatPage(String username,String password,Map<String, Object>map,HttpSession session){
	if(!StringUtils.isNullOrEmpty(username)&&"123456".equals(password)){
		session.setAttribute("loginUser", username);
		return "chat";
		//使用重定向，防止表单重新提交
	/*	return "redirect:/222";*/
	}else{
/*		req.setAttribute("msg", "用户名or密码错误");*/
		map.put("msg", "用户名或密码错误");
		return "login";
	}
	
	
  
		
	}
	
}
