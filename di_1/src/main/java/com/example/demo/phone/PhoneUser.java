package com.example.demo.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//갤럭시 폰이나 아이폰이 폰유저의 의존성 - 왜냐하면 바뀔 경우 모든걸 다 바꿔줘야 하기 때문 

public class PhoneUser {
	private Phone phone;

	@Autowired
	public PhoneUser(@Qualifier("iphone") Phone p) {
		this.phone = p;
	}

	public void setPhone(Phone p) {
		this.phone = p; // 파라미터로 넘겨줌
	}

	public void call(String to) {
		System.out.println(phone.getClass().getName() + "으로 전화");
	}
}
