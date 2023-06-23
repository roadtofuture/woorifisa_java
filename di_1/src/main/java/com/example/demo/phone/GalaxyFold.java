package com.example.demo.phone;

import org.springframework.stereotype.Component;

@Component("galaxy")
public class GalaxyFold implements Phone {
	@Override
	public void call(String to) {
		System.out.println("갤럭시로 진화" + to);
	}
}
