package com.example.demo.model.entity;

import java.util.List;

import com.example.demo.model.dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString(exclude = "boards") //boards와 user가 뺑뺑이 돌고 있는 상황이라 tostring method에서 이건 빼줘 
public class User {
	@Id

	private String id; //auto-increment가 아니고 
	private String pass;
	private String name;
	private String grade;
	
	@OneToMany(mappedBy = "user")
	List<Board> boards; //###이부분에서 보드로 감 

	public UserDto toDto() {
		UserDto user = new UserDto();
		user.setId(this.getId());
		user.setName(this.getName());
		user.setPass(this.getPass());
		user.setGrade(this.getGrade());
		return user;
	}
}
