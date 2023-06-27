package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.entity.User;
import com.example.demo.model.repo.UserRepository;

@DataJpaTest //rollback기능 자동 
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepoTest {
	@Autowired
	UserRepository repo;
	
	@Test
	public void insertTest() {
		//User user = new User("hong", "홍길동", "1234", "GUEST");
		User user = User.builder().id("hong").name("홍길동").pass("1234").build();
		repo.saveAndFlush(user); //flush는 저장하고 바로 entitymanager에 반영 , commit과의 차이점 
		
		User selected = repo.findById("hong").get();
		Assertions.assertEquals(user, selected);
		
	}
}
