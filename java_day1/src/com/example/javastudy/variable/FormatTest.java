package com.example.javastudy.variable;

public class FormatTest {
	
	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";  //string이라고 만들어진 클래스를 사용 , 클래스명 시작할때 대문자라 
		double height = 180.5;
		boolean hasEaten = true;
		
		System.out.printf("나는 %d살이고 이름은 %s, 키는 %5.1fcm, 밥은 먹었니? %b\n", 
				age, name, height, hasEaten);
	}

}
 