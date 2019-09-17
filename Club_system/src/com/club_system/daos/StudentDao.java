package com.club_system.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.club_system.pojos.Student;
import com.club_system.utilities.ConnectionPool;

public class StudentDao{
	
	public static int verify(String enroll_id, String password){
		int s_id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select s_id from student where enroll_id = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, enroll_id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s_id = rs.getInt("s_id");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return s_id;
	}

	
	
	/*public static int verify(String enroll_id, String contact, String name, String password, String email, String college, String interest){
		int s_id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select s_id from student where enroll_id = ? and contact = ? and name = ? and password = ? and email = ? and college = ? and interest = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, enroll_id);
			ps.setString(2, contact);
			ps.setString(3, name);
			ps.setString(4, password);
			ps.setString(5, email);
			ps.setString(6, college);
			ps.setString(7, interest);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s_id = rs.getInt("s_id");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return s_id;
	}*/

	
	public void create(Student student) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "Insert into Student (enroll_id, contact, name, password, email, college, interest) values(?,?,?,?,?,?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, student.getenroll_id());
	        ps.setString(2, student.getcontact());
	        ps.setString(3, student.getname());
	        ps.setString(4, student.getpassword());
	        ps.setString(5, student.getemail());
	        ps.setString(6, student.getcollege());
	        ps.setString(7, student.getinterest());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to create a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	    
	}
	
	
	
	
	
	public void edit(Student student) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "update Student as enroll_id=? ,contact=?, name=?, password=?, email=?, college=?, interest=? where s_id=? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, student.getenroll_id());
	        ps.setString(2, student.getcontact());
	        ps.setString(3, student.getname());
	        ps.setString(4, student.getpassword());
	        ps.setString(5, student.getemail());
	        ps.setString(6, student.getcollege());
	        ps.setString(7, student.getinterest());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	
	public void remove(int s_id) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "delete from student where s_id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, s_id);
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	public Student find(int s_id) 
	{
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    Student student = new Student();
	    
	    try {
	    	String sql = "select * from student where s_id= ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, s_id);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) 
	        {
	        	student.sets_id(s_id);
	        	student.setenroll_id(rs.getString("enroll_id"));
	        	student.setname(rs.getString("name"));
	        	student.setcontact(rs.getString("contact"));
	        	student.setemail(rs.getString("email"));
	        	student.setpassword(rs.getString("password"));
	        	student.setcollege(rs.getString("college"));
	        	student.setinterest(rs.getString("interest"));
	        	student.setClub_id(rs.getInt("club_id"));
	        	
	        }
	    }
	    
	    catch (SQLException sq) 
	    {
	    	System.out.println("Unable to find row."+sq);
	    }
	    finally{
	    	pool.putConnection(conn);
	    }
	    return student;
	}
	
	
	public ArrayList<Student> findAll(){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Student> listStudent = new ArrayList<Student>();
		
		try{
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.sets_id(rs.getInt("s_id"));
				student.setenroll_id(rs.getString("enroll_id"));
				student.setcontact(rs.getString("contact"));
				student.setname(rs.getString("name"));
				student.setpassword(rs.getString("password"));
				student.setemail(rs.getString("email"));
				student.setcollege(rs.getString("college"));
				student.setinterest(rs.getString("interest"));
				listStudent.add(student);
			}
		}
		catch (SQLException sq) {
			System.out.println("unable to findall the table" + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return listStudent;
	}
	
	
	public static void main(String args[]) {
		
		StudentDao cd = new StudentDao();
		Student obj = new Student("6071","800529197","Tanya Dwivedi","1234568","harshitdwivedi95@gmail.com", "LNCTS", "Big Data");
		cd.create(obj);
		
		
		//StudentDao cd = new StudentDao();
		//ArrayList<Student> al = cd.findAll();
		//for(Student student : al) {
	    //System.out.println(student);
		}
		//StudentDao cd = new StudentDao();
		//cd.remove(1);
		}
		
	


	