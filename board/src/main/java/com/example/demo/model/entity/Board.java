package com.example.demo.model.entity;

import com.example.demo.model.dto.BoardDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@ToString(exclude = "user") // 이건 제외해줘 
public class Board {
	@Id
	private int no;
	private String title;
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user; //###이부분에서 유저로 감 
	
	public BoardDto toDto() {
		BoardDto board = new BoardDto();
		board.setNo(this.getNo());
		board.setTitle(this.getTitle());
		board.setContent(this.getContent());
		
		return board;
	}
	

	
	
}
