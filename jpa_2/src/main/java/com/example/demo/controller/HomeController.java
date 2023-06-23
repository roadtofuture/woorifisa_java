package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.service.RepoService;

import lombok.extern.slf4j.Slf4j;

@Controller // Component 대신
@Slf4j
public class HomeController {

	RepoService service;

	@Autowired
	public HomeController(RepoService service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/hello")
	// 1. 파라미터 처리, model: spring framework
	public String hello(@RequestParam String name, Model model) { //@RequestParam을 쓰면 받고 싶은 파라미터를 받을 수 있음 
		log.debug("hello의 파라미터: {}", name);
		// 2. 비즈니스 모델 연결
		String msg = service.helloService(name);
		// 화면에 전달할 값 저장 
		// model 영역: request scope 
		model.addAttribute("msg", msg);
		// 3. 그냥 리턴하면 forward로 페이지 전환 : return 되는 페이지에 return으로 호출
		return "hello"; 
	}
	
	@RequestMapping(value="/onlypost", method=RequestMethod.POST)
	public String onlyPost() {
		return "/";
	}
}
