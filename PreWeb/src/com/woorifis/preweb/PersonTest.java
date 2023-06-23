package com.woorifis.preweb;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonTest {

	// private static final Logger log =LoggerFactory.getLogger(PersonTest.class)
	public static void main(String[] args) {
		log.trace("trace level: {}, {}, {}", 1, "Hi", true);
		log.debug("trace level: {}, {}, {}", 1, "Hi", true);
		log.info("trace level: {}, {}, {}", 1, "Hi", true);
		log.warn("trace level: {}, {}, {}", 1, "Hi", true);
		log.error("trace level: {}, {}, {}", 1, "Hi", true);
		Person p1 = new Person("홍길동");
		System.out.println(p1);
		Person p2 = new Person("홍길동");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		// @ Builder에 의한 builder pattern 사용
		Person p3 = Person.builder().name("홍길동").age(29).build();
		System.out.println(p3);
		p3.grow(10);
		p3.grow(10);
	}
}
