package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woorifis.webday3.model.MyCalcService;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
@Slf4j
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 1. 파라미터 분석
		String type = request.getParameter("type");
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		log.debug("num1:{}, num2: {}, type:{}", strNum1, strNum2, type);
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		// 2. 비즈니스 전문가(모델) 호출
		int result = MyCalcService.getService().add(num1, num2);
		log.debug("add result: {}", result);
		//화면에 전달할 추가적인 데이터를 설정한다.
		request.setAttribute("result", result);
		Cookie cookie = new Cookie("calc_" +System.currentTimeMillis(), num1 + "+" + num2 + "=" +result);
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		
		// 3. 화면 전문가(view) 연결 - 포워드 방식
		String path = "/calc/addresult.jsp";
		if("forward".equals(type)) {
		RequestDispatcher disp = request.getRequestDispatcher(path);
		disp.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath()+path); //sendRedirect는 container root이므로 context root가 개입이 되어야 
		}
	}

}
