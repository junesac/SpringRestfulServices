package com.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.controller.HelloController;
import com.controller.HomePageController;
import com.service.HelloService;

@Configuration
public class AppConfig {

	@Bean
	public HelloService getHelloService() {
		return new HelloService();
	}

	@Bean
	public HelloController helloController() {
		return new HelloController();
	}

	@Bean
	public HomePageController homePageController() {
		return new HomePageController();
	}

}
