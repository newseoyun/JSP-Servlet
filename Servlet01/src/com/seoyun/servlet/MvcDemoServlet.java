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

		// Add data : ������ ���� �ֱ�. ���߿� �𵨷� �� �� �ְڳ�
		String[] students = {"Susan", "Anil", "Mohamed", "Trupti"};
		request.setAttribute("student_list", students);
		
		// �ڹ� �����Լ��� request dispatcher�� �� ������ ��������
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_students.jsp");
		
		// forward �Լ��� ������
		dispatcher.forward(request, response);
		
	}
		
}
