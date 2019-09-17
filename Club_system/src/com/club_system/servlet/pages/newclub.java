package com.club_system.servlet.pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.club_system.daos.ClubDao;
import com.club_system.pojos.Club;

/**
 * Servlet implementation class newclub
 */
@WebServlet("/newclub")
public class newclub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newclub() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String tag = request.getParameter("tag");
		String dept = request.getParameter("dept");
		Club s = new Club(name, dept, tag);
		ClubDao sd = new ClubDao();
		sd.create(s);
		HttpSession session = request.getSession();
		session.setAttribute("Club_name", name);
		response.sendRedirect("Pages/ty.jsp");
	}

}
