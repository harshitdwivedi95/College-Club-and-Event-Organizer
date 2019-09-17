package com.club_system.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.club_system.pojos.Event;
import com.club_system.utilities.ConnectionPool;

public class EventDao{
	
	public static int verify(int club_id, String name) {
		int event_id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select event_id from event where club_id = ? and event = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, club_id);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				event_id = rs.getInt("event_id");
				club_id = rs.getInt("club_id");
				name = rs.getString("name");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return event_id;
	}

	
	public void create(Event event) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "Insert into Event (club_id, name) values(?,?)";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, event.getclub_id());
	        ps.setString(2, event.getname());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to create a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	    
	}
	
	
	
	
	
	public void edit(Event event) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "update event as club_id=?, name=? where event_id=? ";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, event.getclub_id());
	        ps.setString(2, event.getname());
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	
	public void remove(int event_id) {
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    
	    try {
	    	String sql = "delete from event where event_id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, event_id);
	        ps.executeUpdate();
	    }
	    
	    catch (SQLException sq) {
	    	System.out.println("Unable to edit a row."+sq);
	    }
	    
	    finally {
	    	pool.putConnection(conn);
	    }
	
	}
	
	
	
	
	
	public Event find(int event_id) 
	{
		ConnectionPool pool =  ConnectionPool.getInstance();
		pool.initialize();
	    Connection conn = pool.getConnection();
	    Event event = new Event();
	    
	    try {
	    	String sql = "select * from event where event_id= ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, event_id);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) 
	        {
	        	event.setclub_id(event_id);
	        	event.setname(rs.getString("name"));
	        }
	    }
	    
	    catch (SQLException sq) 
	    {
	    	System.out.println("Unable to find row."+sq);
	    }
	    finally{
	    	pool.putConnection(conn);
	    }
	    return event;
	}
	
	
	public ArrayList<Event> findAll(){
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Event> listEvent = new ArrayList<Event>();
		
		try{
			String sql = "select * from event";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Event event = new Event();
				event.setevent_id(rs.getInt("event_id"));
				event.setclub_id(rs.getInt("club_id"));
				event.setname(rs.getString("name"));
				listEvent.add(event);
			}
		}
		catch (SQLException sq) {
			System.out.println("unable to findall the table" + sq);
		}
		finally {
			pool.putConnection(conn);
		}
		return listEvent;
	}
	
	
	public static void main(String args[]) {
		
		//EventDao cd = new EventDao();
		//Event obj = new Event( 2,"Workshop on bigdata");
		//cd.create(obj);
		
		
		//EventDao cd = new EventDao();
		//ArrayList<Event> al = cd.findAll();
		//for(Event event : al) {
	     //System.out.println(event);
		//}
		
		EventDao cd = new EventDao();
		cd.remove(1);
		}
		
	
}

	