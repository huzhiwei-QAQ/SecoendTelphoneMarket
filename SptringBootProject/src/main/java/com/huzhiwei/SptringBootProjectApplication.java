package com.huzhiwei;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SptringBootProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SptringBootProjectApplication.class, args);
		 SpringApplication springApplication = new SpringApplication(SptringBootProjectApplication.class);
				    springApplication.setBannerMode(Banner.Mode.CONSOLE);
				    springApplication.run(args);
	}

}
