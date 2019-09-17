package com.club_system.servlet.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.club_system.daos.AdminDao;

/**
 * Servlet implemantation class Admin_loginservlet
 */

@WebServlet("/Admin_loginservlet")
public class Admin_loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Admin_loginservlet() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse +
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
 
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
           response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get request parameters for userID and password
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String dept = request.getParameter("dept");
		System.out.println("name : " + name);
		System.out.println("password : " + password);
		System.out.println("dept : " + dept);
		
		if(name == null && password == null && dept == null)
			response.sendRedirect("Pages/Admin_login.jsp");
		int admin_id = AdminDao.verify(name, password, dept);
		System.out.println("name : " + name);
		System.out.println("name : " + admin_id);
		if(admin_id != -1) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("password", password);
			session.setAttribute("dept", dept);
			response.sendRedirect("Pages/Admin_home.jsp");
		}else {
			response.sendRedirect("Pages/Admin_login.jsp");
		}
		
	}
	
}



