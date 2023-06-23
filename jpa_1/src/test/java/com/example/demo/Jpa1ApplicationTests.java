package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.entity.Employee;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j

//테스트 시 메모리 DB로 변경하지 말고 application.properties의 DB use
@AutoConfigureTestDatabase(replace = Replace.NONE)
//@SpringBootTest
@DataJpaTest //Spring Data Jpa 테스트 전용 클래스 : @Transactional : 들어간 것만 보고 확인하고 rollback 시키는 기능


class Jpa1ApplicationTests {

	@Autowired
	EntityManager em;
	
	@Test
	public void crudtest() {
		//Employee를 만들어보자
		Employee emp = Employee.builder().gender('M').managerNo(0)
				.age(10)
				.name("hong gil dong").build();
		
		//저장해보자.
		em.persist(emp);
		
		//반영해보자.
		em.clear();
		
		
		//조회해보자.
		Employee selected = em.find(Employee.class, 1);
		log.debug("조회된 객체: {}", selected);
		
		Assertions.assertEquals(selected.getEmpNo(), 1);
	}
}
