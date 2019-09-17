package com.club_system.servlet.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.club_system.daos.StudentDao;
import com.club_system.pojos.Student;

/**
 * Servlet implementation class Registrationservlet
 */
@WebServlet("/Registrationservlet")
public class Registrationservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registrationservlet() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse 
	 *       response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		//TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
    }
	
	/**
	 * @see HttpServet#doPost(HttpServletRequest request, HttpServletResponse 
	 *       response) 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		String enroll_id = request.getParameter("enroll_id");
		String contact = request.getParameter("contact");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String college = request.getParameter("college");
		String interest = request.getParameter("interest");
		System.out.println(enroll_id);
		
	    //if(enroll_id !=null && contact !=null && name !=null && password !=null 
          //   	&& email !=null && college !=null && interest !=null) {
			
			Student s = new Student(enroll_id, contact, name, password, email, college, interest);
			StudentDao sd = new StudentDao();
			sd.create(s);
		
		
		response.sendRedirect("Pages/Login.jsp");
	}
	
}


