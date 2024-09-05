package com.example.jspWebApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String goToHome() {
		String s = "debugtesting";
		return "test";
	}

}
