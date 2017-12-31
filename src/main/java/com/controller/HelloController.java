package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.HelloMessage;
import com.service.HelloService;

@RestController
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("getHello")
	public HelloMessage getHello() {

		return helloService.getMessage();
	}

}
