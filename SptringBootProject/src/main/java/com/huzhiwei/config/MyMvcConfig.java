package com.huzhiwei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//使用WebMvcConfigurer接口扩展springmvc的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addViewControllers(registry);
		//可以代替controllor中的功能，浏览器发送he请求来到login页面
		registry.addViewController("/111").setViewName("login");

	}

	@Bean
	public WebMvcConfigurer webMvcConfigurer(){
		WebMvcConfigurer webMvcConfigurer=new WebMvcConfigurer() {

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				// TODO Auto-generated method stub
			//	WebMvcConfigurer.super.addViewControllers(registry);
				registry.addViewController("/").setViewName("login");
					/*	registry.addViewController("/222").setViewName("chat");*/
			}
			
		};
		
		return webMvcConfigurer;
		
	}
/*	//注册拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		System.out.println("拦截器注册");
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
		.excludePathPatterns("/","/111","/hello","/css/**","/js/**","/images/**","/fonts/**");
	}*/
	
	//将自定义区域性息解析器加入到springmvc
	@Bean
public LocaleResolver localeResolver(){
	return new MyLocaleResolver();
	
}
}
