package com.example.javastudy.variable;

public class CastingTest {

	public static void main(String[] args) {
		int i = 10000;
		double d = i;  // 이런식으로 더 큰 범위로 형변환이 가능 
		System.out.println(d);
		
		int x = 10000;
		float f = x;
		System.out.println(f); //값 손실 없음: 묵시적 형변환
		
		long l = (long)f;
		System.out.println(l); //long: 64bit, f:32bit
		
		byte b = (byte)l;
		System.out.println(b);
		
		
	}

}
