package com.club_system.servlet.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.club_system.daos.ClubDao;
import com.club_system.pojos.Club;




/**
 * Servlet implementation class Club_lists
 */
@WebServlet("/Club_lists")
public class Club_lists extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Club_lists() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Event And Club </title>");
		out.println(
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>");
out.println(
		"<link rel=\"stylesheet\" type=\"text/css\" href=\"/Club_system/resources/tt.css\" media=\"all\" />");


		out.println("</head>");
		out.println("<body>");
		ClubDao pDao = new ClubDao();
		ArrayList<Club> orderList = pDao.findAll();
		for (Club club : orderList) {
		out.println("<div style=\"overflow-x:scroll class=\"wrapper-card\">");
		out.println("<div class=\"card\">");
		out.println("<div class=\"card-title\">");
		out.println("<h3>"+ club.getname() + "</h3>");
		out.println("<h4> organised by "+ club.getdept() +" department</h4>");
		out.println("</div>");
	        
		out.println("<div class=\"card-description\">");
		out.println("<ul>");
		out.println("<li>" + club.gettag()+"</li>");
	                
		out.println("</ul>");
		out.println("</div>");
				out.println("<div class=\"card-action\">");
				out.println("<button type=\"button\">Check for Events</button>");
						out.println("<button type=\"button\">Join Club</button>");
								out.println("</div>");
										out.println("</div>");
	    
												out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}}

}
