package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.phone.Iphone;
import com.example.demo.phone.Phone;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j

class Di1ApplicationTests {

	@Test // 단위테스트 - 동작을 이렇게 테스트 Junit 탭을 통해 결과를 본다. 빨강은 fail, 초록은 success
	void contextLoads() {
		Calculator c = new Calculator();
		int result = c.add(100, 200);
		Assertions.assertEquals(result, 300); // assertions: junit.jupiter로 자동완성시켜주기
		Assertions.assertEquals(c.add(1, 5), 6);
	}

	@Autowired // 해당 타입의 빈을 가져오세요!
	ApplicationContext ctx;

	@Test
	public void beanTest() {
		String[] beanNames = ctx.getBeanDefinitionNames();
		for (String name : beanNames) {
			log.debug("name:{}", name);
			// 출력이 안된다 -> =INFO보다 낮은 레벨이라서? ->application.properties에 추가
		}
	}

	@Test
	public void getBeanTest() {
		Iphone iphone = ctx.getBean(Iphone.class); // 타입 기반으로 빈 요청 (제일 편리) getBean자동완성 첫번째
		iphone.call("101");
		Object obj = ctx.getBean("galaxy"); // 이름 기반으로 빈 요청 getBean자동완성 두번째
		Assertions.assertNotNull(obj);

	}

	@Test
	public void getBeanTest2() {
		//Phone p = ctx.getBean(Phone.class); 
		Phone p = ctx.getBean("galaxy", Phone.class); //이름기반 + 타입기반 빈 요청 (여러개가 있을 경우 이름까지 추가) getBean자동완성 네번째
		Assertions.assertNotNull(p);
	}
}
