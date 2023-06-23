package com.example.demo.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 1. Javabeans 규약으로 만들어야 
//- 모든 멤버는 private
//- getter/setter, default constructor 는 반드시 있어야 한다 

@Data
@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자를 만듦
@NoArgsConstructor // 파라미터가 없는 기본 생성자를 생성
@Builder
@Entity //테이블과 매핑해야 한다 
public class Employee {
	@Id // PK로 동작하는 녀석 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private long empNo;
	private String name;
	private int age;
	private char gender;
	private long managerNo;
	private LocalDateTime hireDate;
	
	@ManyToOne(optional = false) // 여러 employee: dept (n:1관계), optional= false면 inner join 하겠다.
	@JoinColumn(name="dept_dept_id") // join에 사용되는 컬럼 
	private Dept dept;
	
	
	
}
