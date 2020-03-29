package com.seoyun.servletmvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcServletTwo
 */
@WebServlet("/MvcServletTwo")
public class MvcServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 모델로부터 데이터를 가져온다
		List<Student> students = StudentDataUtil.getStudents();
			
		// 데이터를 request 오브젝트에 넣는다
		request.setAttribute("student_list", students);
			
		// request dispatcher로 뷰페이지 가져온다
		RequestDispatcher dispatcher = request.getRequestDispatcher("view_student_two.jsp");		
		
		// 포워딩
		dispatcher.forward(request, response);


	}

}
