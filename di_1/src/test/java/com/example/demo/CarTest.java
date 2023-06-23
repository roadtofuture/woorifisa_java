package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.car.SuperCar;

@SpringBootTest
public class CarTest {
	@Autowired //필요한 빈 객체 연결 
	ApplicationContext ctx;
	
	@Test
	public void beanCreationTest() {
		SuperCar f = ctx.getBean(SuperCar.class);
		Assertions.assertNotNull(f);
	}
	
	@Test
	public void singletonTest( ) {
		SuperCar f1 = ctx.getBean(SuperCar.class);
		SuperCar f2= ctx.getBean(SuperCar.class);
		SuperCar f3= ctx.getBean("ferrari", SuperCar.class);
		Assertions.assertEquals(f1, f2);
		Assertions.assertSame (f2, f3);
		Assertions.assertSame(f1, f3);
	}
}
