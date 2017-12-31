package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HomePageController {

	@RequestMapping("/abc")
	public String hello() {
		return "hello";
	}
}
