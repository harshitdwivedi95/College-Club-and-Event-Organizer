package com.club_system.pojos;


public class Admin{
	private int admin_id;
	private String password;
	private String name;
	private String dept;
	
	public Admin() {
		super();
		this.password = new String();
		this.name = new String();
	}
	
	public Admin(int admin_id, String password, String name, String dept){
        super();
        this.admin_id = admin_id;
        this.password = password;
        this.name = name;
        this.dept = dept;
	}
	
	public Admin(String password, String name, String dept){
        super();
        this.password = password;
        this.name = name;
        this.dept = dept;
	}
	
	
	public Admin(String name, String password){
        super();
        this.name = name;
        this.password = password;
	}

   /**
    * @return the admin_id
    **/
	public int getadmin_id() {
		return admin_id;
	}
	
	
	/**
	 * @param admin_id the admin_id to set
	*/
	
	public void setadmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	
	

	
	/**
	 * @return the password
	**/
    public String getpassword() {
	    return password;
	}
		
		
	/**
     * @param password the password to set
	*/
	public void setpassword(String password) {
		this.password = password;
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



  @Override
  public String toString() {
      return "Admin [name=" + name + " , password=" + password +", dept=" +dept +" ] ";  
  }

} 
