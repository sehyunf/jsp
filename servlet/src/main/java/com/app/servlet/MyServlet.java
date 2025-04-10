package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/home")
// URL을 mapping 해주는 역할
// 하지만 파일 하나의 어노테이션이 다 들어가 있으면, 유지보수가 어렵다.
// 따라서 web.xml을 연결해서 한번에 일괄적으로 관리한다
// 프로젝트 하나당 web.xml하나

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		인코딩 설정 필수*		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8;");
		
		PrintWriter out = response.getWriter();
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		String result = null;
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		sum = num1 + num2;
		
		result = sum % 2 == 0 ? "짝수" : "홀수";
		
		out.print("<h1>😺Hello, JSP!😺</h1>");
		out.print("<span>"+ num1 + " + " + num2 + " = " + sum + ", " + result + "입니다" + "</span>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
