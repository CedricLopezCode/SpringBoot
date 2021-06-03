package com.example.demo.controller.angular;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeControllerAngular {

	@GetMapping("/api")
	public String home() {
		return "home";
	}
}
