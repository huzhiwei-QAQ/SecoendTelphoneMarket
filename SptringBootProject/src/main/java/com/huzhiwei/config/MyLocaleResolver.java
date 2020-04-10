package com.huzhiwei.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.LocaleResolver;

import com.mysql.cj.util.StringUtils;

//自定义区域性息解析器 
public class MyLocaleResolver implements LocaleResolver{

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		//拿到请求中的l
	String l = request.getParameter("l");
	Locale locale=Locale.getDefault();
	if(!StringUtils.isNullOrEmpty(l)){
		String[] split = l.split("_");
		locale = new Locale(split[0],split[1]);
		
	}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		// TODO Auto-generated method stub
		
	}

}
