package com.example.demo.heroes;

import org.springframework.stereotype.Component;

@Component("hulk")
public class Hulk implements Heroes {
	
	public void help() {
		System.out.println("도와줄게");
	}
}
