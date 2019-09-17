package com.club_system.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.club_system.pojos.Admin;
import com.club_system.utilities.ConnectionPool;

public class AdminDao{
	
	public static int verify(String name, String password, String dept) {
		int admin_id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select admin_id from admin where name = ? and password = ? and dept = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, dept);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				admin_id = rs.getInt("admin_id");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return admin_id;
	}

	
	public void create(Admin admin) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "Insert into Admin (name, password, dept ) values(?,?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, admin.getname());
	        ps.setString(2, admin.getpassword());
	        ps.setString(3, admin.getdept());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to create a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	    
	}
	
	
	
	
	
	public void edit(Admin admin) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "update Admin as password=? , name=?, dept=? where admin_id=? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, admin.getpassword());
	        ps.setString(2, admin.getname());
	        ps.setString(3, admin.getdept());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	
	public void remove(int admin_id) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "delete from admin where admin_id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, admin_id);
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	public Admin find(int admin_id) 
	{
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    Admin admin = new Admin();
	    
	    try {
	    	String sql = "select * from admin where admin_id= ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, admin_id);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) 
	        {
	        	admin.setadmin_id(admin_id);
	        	admin.setname(rs.getString(""));
	        }
	    }
	    
	    catch (SQLException sq) 
	    {
	    	System.out.println("Unable to find row."+sq);
	    }
	    finally{
	    	pool.putConnection(conn);
	    }
	    return admin;
	}
	
	
	public ArrayList<Admin> findAll(){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Admin> listAdmin = new ArrayList<Admin>();
		
		try{
			String sql = "select * from admin";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Admin admin = new Admin();
				admin.setadmin_id(rs.getInt("admin_id"));
				admin.setname(rs.getString("name"));
				admin.setpassword(rs.getString("password"));
				admin.setdept(rs.getString("dept"));
				listAdmin.add(admin);
			}
		}
		catch (SQLException sq) {
			System.out.println("unable to findall the table" + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return listAdmin;
	}
	
	
	public static void main(String args[]) {
		
		AdminDao cd = new AdminDao();
		Admin obj = new Admin("Nimisha","123456789","CSE");
		cd.create(obj);
		
		
		//AdminDao cd = new AdminDao();
		//ArrayList<Admin> al = cd.findAll();
		//for(Admin admin : al) {
	     //System.out.println(admin);
		
		//AdminDao cd = new AdminDao();
		//cd.remove(1);
		}
		
	
}

	