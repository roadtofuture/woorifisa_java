package com.example.demo.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  deptId;
	private String deptName;
	@OneToMany(mappedBy = "dept")
	List<Employee> emps;
	
}
