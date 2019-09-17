package com.club_system.servlet.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Request
 */
@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
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
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("Club_name");
		System.out.println(name);
		out.println("<div  class=\"wrapper-card\">");
		out.println("<div class=\"card\">");
		out.println("<div class=\"card-title\">");
		out.println("<h3>"+ name + "</h3>");
		out.println("<h4> you have a new request for "+ name +" Club</h4>");
		out.println("</div>");
	        
		/*out.println("<div class=\"card-description\">");
		out.println("<ul>");
		out.println("<li>" + club.gettag()+"</li>");
	                
		out.println("</ul>");
		out.println("</div>");*/
				out.println("<div class=\"card-action\">");
				out.println("<button type=\"button\">accept request</button>");
						out.println("<button type=\"button\">cancel</button>");
								out.println("</div>");
										out.println("</div>");
	    
												out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
	}


