package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.BoardDto;
import com.example.demo.model.entity.Board;
import com.example.demo.model.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	private BoardService service;

	@Autowired
	public BoardController(BoardService service) {
		this.service = service;
	}

	@GetMapping("/regist")
	public String registForm() {
		return "board/registboard";
	}
	
	@PostMapping("/regist")
	public String registBoard(@ModelAttribute BoardDto board) {
		service.writeBoard(board);
		return "redirect:/board/list";
	}

	@GetMapping("/list")           														//model : 화면에 띄워주기 위해 ?
	public String list(@RequestParam(required = false, defaultValue = "1") Integer page, Model model) {
		// integer라고 쓰는 이유: optional이기 때문에 기본형이면 null인 상태가 있을수가 없음
		page--;
		// 페이징 처리 - 한페이지에 10개씩 보여주자
		Page<Board> pageInfo = service.listBoard(page);
		model.addAttribute("pageInfo", pageInfo);
		//log.debug("page: {}, page)");
		return "board/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam int no, Model model) {
		log.debug("no:{}", no);
		try {
		Board board = service.detailBoard(no);
		model.addAttribute("board", board); //번호를 board로 담아놓겠다 
		return "board/detail";
		} catch (RuntimeException e) {
			return "/board/list";
		}
		
	}
	
	@GetMapping("/delete") //<a href>타고 넘어올때는
	public String delete(@RequestParam int no) {
		log.debug("board no:{}", no);
		service.deleteBoard(no);
		
		return "redirect:/board/list"; 
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute BoardDto dto, Model model) {
		log.debug("board 수정: {}", dto);
		service.writeBoard(dto);
		return "redirect:/board/detail?no=" +dto.getNo();
	}
}
