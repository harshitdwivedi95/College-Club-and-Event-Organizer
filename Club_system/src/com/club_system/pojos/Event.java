package com.club_system.pojos;


public class Event{
	private int event_id;
	private int club_id;
	private String name;
	
	public Event() {
		super();
		this.name = new String();
	}
	
	public Event(int event_id, int club_id, String name){
        super();
        this.event_id = event_id;
        this.club_id = club_id;
        this.name = name;
	}
	
	public Event(int club_id, String name){
        super();
        this.club_id = club_id;
        this.name = name;
	}

   /**
    * @return the event_id
    **/
	public int getevent_id() {
		return event_id;
	}
	
	/**
	 * @param admin_id the event_id to set
	*/
	
	public void setevent_id(int event_id) {
		this.event_id = event_id;
	}
	
	

	
	/**
	 * @return the club_id
	**/
    public int getclub_id() {
	    return club_id;
	}
		
	/**
     * @param club_id the club_id to set
	*/
	public void setclub_id(int club_id) {
		this.club_id = club_id;
	}


		
		
		
	/**
     * @return the name
    **/
	public String getname() {
	return name;
	}
			
	/**
	* @param name the name to set
	*/
			
	public void setname(String name) {
	this.name = name;
	}




  @Override
  public String toString() {
      return "Club [name=" + name + " , club_id=" + club_id +", event_id=" +event_id +" ] ";  
  }

} 
