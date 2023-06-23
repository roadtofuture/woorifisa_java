package com.woorifis.webday3.model;

public class MyCalcService {
	// 비즈니스 로직- 모델단에 있는 애들은 대부분 싱글턴으로 간다 new하지 못하게 한다

	private static MyCalcService service = new MyCalcService();

	// setter는 애초에 만들지 못하니까 의미가 없음

	private MyCalcService() {
	}

	public static MyCalcService getService() {
		return service;
	}

	public int add(int a, int b) {
		return a + b;
	}
}
