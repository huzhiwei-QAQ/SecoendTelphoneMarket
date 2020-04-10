package com.huzhiwei.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aopalliance.intercept.Interceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
//拦截器
public class LoginHandlerInterceptor implements HandlerInterceptor{
//登录检查
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*Object attribute = request.getSession().getAttribute("loginUser");
		System.out.println("attribute:"+attribute);
		if(attribute==null){
			request.setAttribute("msg","没有权限，请先登录" );
			//未登录，返回登录页面
			request.getRequestDispatcher("111").forward(request, response);
		}else{
			System.out.println("hahaha");
			//已登录，放行请求
			//处理器执行前方法preHandle，返回true则不拦截后续的处理
			return true;
		}*/
		// TODO Auto-generated method stub
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
