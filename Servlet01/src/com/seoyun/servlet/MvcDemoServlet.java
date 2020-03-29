package com.seoyun.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcDemoServlet
 */
@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MvcDemoServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Add data : 데이터 직접 넣기. 나중에 모델로 할 수 있겠네
		String[] students = {"Susan", "Anil", "Mohamed", "Trupti"};
		request.setAttribute("student_list", students);
		
		// 자바 내장함수인 request dispatcher로 뷰 페이지 가져오기
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp");
		
		// forward 함수로 포워딩
		dispatcher.forward(request, response);
		
	}
		
}
