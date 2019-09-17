package com.club_system.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.club_system.pojos.Club;
import com.club_system.utilities.ConnectionPool;

public class ClubDao{
	
	public static int verify(String enrollment_id, String name, String dept, String tag) {
		int club_id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select club_id from club where enrollment_id = ?, name = ? and tag = ? and dept = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, enrollment_id);
			ps.setString(2, name);
			ps.setString(3, dept);
			ps.setString(4, tag);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				club_id = rs.getInt("club_id");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return club_id;
	}

	
	public void create(Club club) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "Insert into club ( name, dept, tag ) values(?,?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        //ps.setString(1, club.getenrollment_id());
	        ps.setString(1, club.getname());
	        ps.setString(2, club.getdept());
	        ps.setString(3, club.gettag());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to create a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	    
	}
	
	
	
	
	
	public void edit(Club club ) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "update club as enrollment_id=? , name=?, dept=? , tag= ? where club_id=? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setString(1, club.getenrollment_id());
	        ps.setString(2, club.getname());
	        ps.setString(3, club.getdept());
	        ps.setString(4, club.gettag());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	
	public void remove(int club_id) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "delete from club where club_id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, club_id);
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	public Club find(int club_id) 
	{
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    Club club = new Club();
	    
	    try {
	    	String sql = "select * from club where club_id= ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, club_id);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) 
	        {
	        	club.setclub_id(club_id);
	        	//club.setenrollment_id(rs.getString("enrollment_id"));
	        	club.setname(rs.getString("name"));
	        	club.setdept(rs.getString("dept"));
	        	club.settag(rs.getString("tag"));
	        }
	    }
	    
	    catch (SQLException sq) 
	    {
	    	System.out.println("Unable to find row."+sq);
	    }
	    finally{
	    	pool.putConnection(conn);
	    }
	    return club;
	}
	
	
	public ArrayList<Club> findAll(){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Club> listClub = new ArrayList<Club>();
		
		try{
			String sql = "select * from club";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Club club = new Club();
				//club.setclub_id(rs.getInt("admin_id"));
				//club.setenrollment_id(rs.getString("enrollment_id"));
				club.setname(rs.getString("name"));
				club.setdept(rs.getString("dept"));
				club.settag(rs.getString("tag"));
				listClub.add(club);
			}
		}
		catch (SQLException sq) {
			System.out.println("unable to findall the table" + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return listClub;
	}
	
	
	public static void main(String args[]) {
		
		ClubDao cd = new ClubDao();
		//Club obj = new Club("0157CS161071","Big Data", "CSE", "BigData" );
		//cd.create(obj);
		
		
		//AdminDao cd = new AdminDao();
		//ArrayList<Admin> al = cd.findAll();
		//for(Admin admin : al) {
	     //System.out.println(admin);
		
		//AdminDao cd = new AdminDao();
		//cd.remove(1);
		}
		
	
}

	