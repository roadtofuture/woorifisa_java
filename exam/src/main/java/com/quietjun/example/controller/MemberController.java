package com.quietjun.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quietjun.example.model.MemberService;
import com.quietjun.example.model.entity.Member;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")

public class MemberController {
    // TODO: 07.MemberService 타입의 빈을 자동주입 받으시오.
	@Autowired
    // END
    MemberService service;

    @PostMapping("/login")
    public String login(Member member, HttpSession session) {
        String path = "index";
        // TODO: 08.전달받은 member를 이용해서 login 하고 성공 시 세션에서 member를 관리하시오.
        //  로그인 성공 시 redirect로 / 로 이동하고 실패 시 forward로 index로 이동한다.
        
        	Member result = service.login(member);
        	if(result != null) {
        		session.setAttribute("loginMember", result);
        		return "redirect:/";
        } 
        // END
        return path;
    }

    // TODO: 09. get 방식으로 /member/logout의 호출에 동작하는 메서드를 작성하시오.
    //  메서드에서는 세션을 종료시키고 redirec로 /로 이동한다.
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
    // END
    
    @GetMapping("/list")
    public String list(@RequestParam(required = false) Integer page, Model model) {
        page = page==null?0:page-1;
        Page<Member> result = service.list(page);
        model.addAttribute("page", result);
        return "member/list";
    }
}
