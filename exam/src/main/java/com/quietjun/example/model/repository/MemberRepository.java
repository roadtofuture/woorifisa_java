package com.quietjun.example.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quietjun.example.model.entity.Member;

// TODO: 03. Member 테이블에 대한 Repository를 구성하시오.
public interface MemberRepository extends JpaRepository<Member, String>{

// END
}
