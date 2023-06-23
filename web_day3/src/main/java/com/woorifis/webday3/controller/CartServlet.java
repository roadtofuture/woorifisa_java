package com.woorifis.webday3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "cart", urlPatterns = { "/cart" })
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. parameter 처리
		request.setCharacterEncoding("utf-8");
		String product = request.getParameter("product");
		// 2. business logic 처리 (db)
		
		// 3. presentation logic 처리 
		// product를 cart에 담자
		// 기존에 쓰던 카트가 있다면 거기에 추가하고 없으면 새로 만들어야 한다
		HttpSession session= request.getSession();
		Object objCart = session.getAttribute("cart");
		if(objCart==null) {
			List<String> cart = new ArrayList<>(); // 없으면 리스트 형식에 파라미터를 넣어주라
			cart.add(product);						
			session.setAttribute("cart", cart); // cart라는 이름으로 세션에 담아주겠다 
		} else {
			if(objCart instanceof List) {
				List<String> cart = (List)objCart;
				cart.add(product);
				//session.setAttribute("cart", cart); 의미없는 코드
				
			}
		}
		
		//forward로 가도 상관없을듯
		
		RequestDispatcher disp = request.getRequestDispatcher("/login/loginResult.jsp");
		disp.forward(request, response);
	}

	//servlet추가할때마다 server restart해줘야 
}
