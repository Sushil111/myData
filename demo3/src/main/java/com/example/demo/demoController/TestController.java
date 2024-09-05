package com.example.demo.demoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public Object goToHome() {
		String s="debugtesting";
		return "test";
	}

}
