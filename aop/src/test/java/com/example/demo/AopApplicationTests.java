package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.SimpleBean;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class AopApplicationTests {

	@Autowired
	SimpleBean sbean;

	@Test
	public void beanTest() {
		Assertions.assertNotNull(sbean);
	}

	@Test
	public void nameTest() {
		Assertions.assertEquals(sbean.getName(), "홍길동");

		String name = "장길산";
		sbean.setName(name); // setName이 잘 setting이 되었나 확인
		Assertions.assertEquals(sbean.getName(), name); /// 1- assertions을 통해서 쓰는거고 

		log.debug("sbean의 타입은 : {}", sbean.getClass().getSimpleName());
	}

	@Test
	public void setCalTest() {
		Calendar now = Calendar.getInstance();
		sbean.setNow(now);
		assertEquals(now, sbean.getNow()); // 1- static import를 기반으로 쓰는거임 

	}
}
