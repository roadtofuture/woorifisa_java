package com.example.demo.car;

import org.springframework.stereotype.Component;

@Component  //bean으로 쓸거라고 표시 
public class Tesla implements Car {
	public void drive() {
		System.out.println("테슬라 나가신다!!!!!");
	}
}