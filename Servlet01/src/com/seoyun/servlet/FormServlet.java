package com.seoyun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formServlet
 */
@WebServlet("/formServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1 set content type
		response.setContentType("text/html");
		
		// 2 get the printwriter
		PrintWriter out = response.getWriter();
		
		// 3 generate the HTML content
		out.println("<html><body>");
		out.println("The student is confirmed: " + request.getParameter("name"));
		out.println("</body></html>");
		
		
	}


}
