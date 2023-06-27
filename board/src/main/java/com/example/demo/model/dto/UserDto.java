package com.example.demo.model.dto;
import com.example.demo.model.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//DTO니까 entity가 필요가없음..
public class UserDto {

	private String id;
	private String pass;
	private String name;
	private String grade;
	
	public User toEntity() {
		User user = new User();
		user.setId(this.getId());
		user.setName(this.getName());
		user.setPass(this.getPass());
		user.setGrade(this.getGrade());
		return user;
	}

}

