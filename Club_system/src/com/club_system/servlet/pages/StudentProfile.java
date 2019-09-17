package com.club_system.servlet.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.club_system.pojos.Student;
import com.club_system.daos.StudentDao;
import com.club_system.daos.ClubDao;
import com.club_system.pojos.Club;

/**
 * Servlet implementation class StudentProfile
 */
@WebServlet("/StudentProfile")
public class StudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Event And Club</title>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"/Club_system/resources/Style.css\" media=\"all\" />");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"divtop\">");
		out.println("<h1 style='margin-top:0;text-align:center;'></h1>");
		out.println("<h1 style='margin-top:0;text-align:center;'>LAKSHMI NARAIN COLLEGE OF TECHNOLOGY & SCIENCE</h1>");
		out.println("<h1 style='text-align:center;'>My Profile</h1>");
		out.println("<img style=\"margin:0; padding-top:0px; width:200px; height=200px;\" src=\"Pages/LNCT.png\" alt='logo'>");
		out.println("</div>");
		out.println("<div class=\"main\">");
		out.println("</div>");
		//out.println("<form id=\"categoriesForm\" name=\"categoriesForm\"  method=\"post\" action=\"ProductsController\">");
		HttpSession session = request.getSession();
		Integer s_id = (Integer) session.getAttribute("s_id");
		System.out.println(s_id);
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.find(s_id);
		out.println("<div class=\"container\">");
		out.println("<table align=\"center\" class=\"features-table\">");
		out.println(
				"<tr><td align=\"center\"> student id </td><td align=\"center\"> " + student.gets_id() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> Enrollment no </td><td align=\"center\"> " + student.getenroll_id() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> contact no. </td><td align=\"center\"> " + student.getcontact() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> name </td><td align=\"center\"> " + student.getname() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> password </td><td align=\"center\"> " + student.getpassword() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> email </td><td align=\"center\"> " + student.getemail() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> college </td><td align=\"center\"> " + student.getcollege() + "</td><tr>");
		out.println(
				"<tr><td align=\"center\"> interest </td><td align=\"center\"> " + student.getinterest() + "</td><tr>");
		ClubDao clubDao = new ClubDao();
		Club club = clubDao.find(student.getClub_id());
		System.out.println(student.getClub_id());
		out.println(
				"<tr><td align=\"center\"> Club </td><td align=\"center\"> " + club.getname() + "</td><tr>");
		out.println("</table>");
		out.println("<br>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	
	}}
		


