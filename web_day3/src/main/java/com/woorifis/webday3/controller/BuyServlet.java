package com.woorifis.webday3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "buy", urlPatterns = { "/buy" })
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션에서 cart가져와서 구매처리(삭제)
		HttpSession session= request.getSession();
		session.removeAttribute("cart");
		
		response.sendRedirect(request.getContextPath() + "/login/loginResult.jsp");
	}

}
