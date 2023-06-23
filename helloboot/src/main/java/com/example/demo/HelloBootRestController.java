package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootRestController {
	@GetMapping("/hello")
	public String sayHello(String name) {
		return "Hello" + name;
	}
}
