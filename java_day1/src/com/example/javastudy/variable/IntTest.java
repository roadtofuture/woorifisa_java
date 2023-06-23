package com.example.javastudy.variable;

public class IntTest {

	public static void main(String[] args) {
		int i = 10; 
		//int i :선언문, 10: 실행문 동시에 적는 경우 
		//32bit 할당시킨건데 i 라는 이름에 매핑해서 쉽게 부를 수 있도록 한거
		byte b = 10; //8bit, 기본적으로 int인데 byte로 저장해주겠다는 것 
		byte b2 = 128; // 안되는 이유: -128~127까지 가능해서 
		
		long i2 = 10000000000L;  //int 범위를 넘는 정수를 써야 할 경우 L 추가
		//int를 보편적으로 씀. 만약에 연산이 필요없는 read-only면 그냥 byte.
		//하지만 연산시에는 byte를 int로 자동으로 바꿔주고 그 과정에서
		//cpu가 무리가 될 수 있으니 메모리를 엄청 아끼지 않아도 되는 현재 
		//컴퓨팅 환경에서는 그냥 int를 기본으로 쓰기 
	}

}
