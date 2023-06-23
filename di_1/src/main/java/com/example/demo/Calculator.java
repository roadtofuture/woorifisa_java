package com.example.demo;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(100, 200);
		System.out.println(result);
		//실무에서는 테스트의 자동화를 위해 단위테스트를 함 
	}
}
