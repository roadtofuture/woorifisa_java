package com.example.javastudy.variable;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'a'; // 97
		int b = c1 + 1; // 문자는 사실 ascii코드에 숫자로 매핑되어 있다.
		System.out.println(b);
		System.out.println((char)b); // 형변환

	}
}
