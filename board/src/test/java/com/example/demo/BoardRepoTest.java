package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;

import com.example.demo.model.entity.Board;
import com.example.demo.model.entity.User;
import com.example.demo.model.repo.BoardRepository;
import com.example.demo.model.repo.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class BoardRepoTest {
	@Autowired
	BoardRepository brepo;
	
	@Autowired
	UserRepository urepo;
	
	
	@Test
	public void insertTest() {
		// User user = urepo.findById("hong").get(); //select 호출, findbyid로 하면 select쿼리 호출이라 쿼리 낭비로 인한 성능 저하가 있을 수 있음 
		User user = urepo.getReferenceById("hong"); //실제 select를 하지는 않음 
 		Board board = Board.builder().title("제목이당").content("내용이당").user(user).build();//new board를 만들면 안됨. 자동생성되는것이기 때문에 
		brepo.saveAndFlush(board);  
		Board selected = brepo.findById(board.getNo()).get();
		Assertions.assertEquals(selected.getContent(), "내용이당");
		
	}
	
	@Test
	   public void paging() {
	      // 사용자로부터 받아야할 것은 몇 페이지를 볼 것입니까? 몇페이지 누를꺼니?
	      // 1페이지에 5개씩 보여주자!
	      // 페이지 넘버를 받아오는건 컨트롤러
	      // 내부적으로 작동 해주는건 서비스
	      Pageable pageable = PageRequest.of(0, 5, Direction.DESC, "no");//no를 기준으로
	      //페이지는 제로베이스 0페이지(1부터) 5까지
	      Page<Board> boards = brepo.findAll(pageable);
	      List<Board> boardList = boards.getContent(); 
	      Assertions.assertEquals(boardList.get(0).getTitle(),"2 content");
	      Assertions.assertEquals(boards.getTotalPages(),2);

	}

}
