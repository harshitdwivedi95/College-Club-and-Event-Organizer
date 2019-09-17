package com.club_system.servlet.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.club_system.daos.StudentDao;

/**
 * Servlet implementation class Loginservlet
 */

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Loginservlet() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		//TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HtpServletResponse
	 *       response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response )
			throws ServletException, IOException {
		// get request parameters for userID and password
		String enroll_id = request.getParameter("Enroll");
		String password = request.getParameter("psw");
		System.out.println("Enroll : " + enroll_id);
		System.out.println("psw : " + password);
		
		if (enroll_id == null && password == null)
			response.sendRedirect("Pages/Login.jsp");
	    int s_id = StudentDao.verify(enroll_id, password);
	    System.out.println(" Enroll : " + s_id);
	    System.out.println("psw : " + s_id);
	    if(s_id !=-1) {
	    	HttpSession session = request.getSession();
	    	session.setAttribute("s_id", new Integer(s_id));
	    	session.setAttribute("Enroll", enroll_id);
	    	session.setAttribute("psw", password);
	    	response.sendRedirect("Pages/Studenthome.jsp");
	    } else {
	    	response.sendRedirect("Pages/Login.jsp");
	    }
	    
	    
	}
	
}



