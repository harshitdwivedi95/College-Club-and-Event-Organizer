package com.club_system.pojos;


public class Club{
	private int club_id;
	private String enrollment_id;
	private String name;
	private String dept;
	private String tag;
	
	public Club() {
		super();
		this.enrollment_id = new String();
		this.name = new String();
		this.dept = new String();
		this.tag = new String();
	}
	
	public Club(int club_id, String enrollment_id, String name, String dept, String tag){
        super();
        this.club_id = club_id;
        this.enrollment_id = enrollment_id;
        this.name = name;
        this.dept = dept;
        this.tag = tag;
	}
	
	
	public Club( String name, String dept, String tag){
        super();
        
        this.name = name;
        this.dept = dept;
        this.tag = tag;
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
	 * @return the enrollment_id
	**/
    public String getenrollment_id() {
	    return enrollment_id;
	}
	/**
     * @param password the password to set
	*/
	public void setenrollment_id(String enrollment_id) {
		this.enrollment_id = enrollment_id;
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


			
			
	/**
     * @return the dept
	**/
	public String getdept() {
	return dept;
	}
				
	/**
	 * @param dept the dept to set
	*/
	public void setdept(String dept) {
	this.dept = dept;
	}
	
	
	/**
     * @return the tag
	**/
	public String gettag() {
	return tag;
	}
				
	/**
	 * @param tag the tag to set
	*/
	public void settag(String tag) {
	this.tag = tag;
	}



  @Override
  public String toString() {
      return "Club [name=" + name + " , enrollment_id=" + enrollment_id +", dept=" +dept +", tag="+ tag +" ] ";  
  }

} 
