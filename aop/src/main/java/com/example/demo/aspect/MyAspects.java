package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class MyAspects {
	@Before("execution( void com..*.set*(*) )")
	public void logging() { //advice
		//횡단 관심 코드 
		log.debug("set 메서드 호출됨");
	}

}
