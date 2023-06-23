package com.example.demo.car;

import org.springframework.stereotype.Component;

@Component("ferrari") //bean으로 쓸거라고 표시 , 페라리로 bean이름 고정 , 슈퍼카로 바꿔도 이 한줄로 인해 계속 페라리로 
public class SuperCar implements Car {
	public void drive() {
		System.out.println("페라리 나가신다!!!!!");
	}
}
