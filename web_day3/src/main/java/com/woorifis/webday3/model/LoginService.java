package com.woorifis.webday3.model;

public class LoginService {
// 비즈니스 로직

	private static LoginService service = new LoginService();

	private LoginService() {
	}; // getter제공

	public static LoginService getService() {
		return service;
	}

	public boolean login(String id, String password) {  //not visible error가 뜬다면 private 에서 public으로 바꿔주자 
		return "hong".equals(id) && "1234".equals(password);

	}

}
