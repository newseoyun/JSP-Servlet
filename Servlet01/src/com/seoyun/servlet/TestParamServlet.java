package com.seoyun.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// read configuration params
		ServletContext context = getServletContext(); // inherit from HttpServlet
		String maxCartSize = context.getInitParameter("max-cart-size");
		String teamName = context.getInitParameter("team-name");
		
		
		out.println("<html><body>");
		out.println("Max Cart: " + maxCartSize);
		out.println("<br>");
		out.println("Team Name: " + teamName);
		out.println("</body></html>");
	
	
	}

}
