package com.quietjun.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.quietjun.example.model.MemberService;
import com.quietjun.example.model.entity.Member;

import lombok.extern.slf4j.Slf4j;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Slf4j
@Import(value = {MemberService.class})
class EvalutionApplicationTests {
    
    @Autowired
    MemberService service;
    

    @Test
    public void loginTest() {
        Member m = Member.builder().memberId("hong").memberPass("1234").build();
        Member member = service.login(m);
        assertEquals(member.getMemberName(), "홍길동");
        m.setMemberPass("5678");
        member = service.login(m);
        assertNull(member);
    }

}
