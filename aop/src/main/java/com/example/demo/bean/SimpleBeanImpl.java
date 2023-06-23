package com.example.demo.bean;

import java.util.Calendar;

import org.springframework.stereotype.Component;


@Component
public class SimpleBeanImpl implements SimpleBean { //Add unimplemeneted methods한 상태 - 틀 자동생성 
	
	private String name = "홍길동";
	private Calendar now = Calendar.getInstance();

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setNow(Calendar cal) {
		this.now = cal;
		
	}

	@Override
	public Calendar getNow() {
		return this.now;
	}

}
