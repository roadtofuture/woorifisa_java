package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.heroes.Avengers;
import com.example.demo.heroes.Hulk;
import com.example.demo.heroes.IronMan;

@SpringBootTest
public class AvengersTest {

	@Autowired
	Hulk hulk;

	@Autowired
	@Qualifier("iman")
	IronMan iman;

	@Autowired
	Avengers avengers;

	@Test
	public void avengersTest() {
		Assertions.assertNotNull(avengers);
		String pass = avengers.doorPassword;
		Assertions.assertEquals(pass, "1234");
	}

	@Test
	public void ironManTest() {
		Assertions.assertNotNull(iman);
	}

	@Test
	public void beanTest() {
		Assertions.assertNotNull(hulk);
		hulk.help();
	}

}
