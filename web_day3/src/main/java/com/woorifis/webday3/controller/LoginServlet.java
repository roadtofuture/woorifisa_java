package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.woorifis.webday3.model.LoginService;

import lombok.extern.slf4j.Slf4j;


@WebServlet("/login")
@Slf4j
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 1. Parameter
		String id = request.getParameter("id"); // 파라미터 최초 확인
		String password = request.getParameter("password");
		log.debug("id:{}, password: {}", id, password);

		// 2. Business --> 비즈니스 로긴서비스에서 확인
		boolean result = LoginService.getService().login(id, password);

		// 3. Presentation - 포워드 방식
		String path = "/loginform.jsp";
		if (result) {
			path = "/login/loginResult.jsp";
			//request.setAttribute("loginName", id);
			HttpSession session = request.getSession();
			session.setAttribute("loginName", id);
		} else {
			path = "/loginform.jsp"; // 실패시 다시
		}
		RequestDispatcher disp = request.getRequestDispatcher(path);
		disp.forward(request, response);
	}
}
