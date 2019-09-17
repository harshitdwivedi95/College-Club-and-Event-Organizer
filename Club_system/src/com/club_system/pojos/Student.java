package com.club_system.pojos;

public class Student{
	private int s_id;
	private String enroll_id;
	private String contact;
	private String name;
	private String password;
	private String email;
	private String college;
	private String interest;
	private int club_id;
	
	public Student() {
		super();
		this.name = new String();
		this.password = new String();
		this.email = new String();
		this.college = new String();
		this.interest = new String();
		
	}
	    
	public Student(int s_id, String enroll_id, String contact, String name, String password, String email, String college, String interest, int club_id){
	    super();
	    this.s_id = s_id;
	    this.enroll_id = enroll_id;
	    this.contact = contact;
	    this.name = name;
	    this.password = password;
	    this.email = email;
	    this.college = college;
	    this.interest = interest;
	    this.club_id = club_id;

	    
	   }
	
	public Student(String enroll_id, String contact, String name, String password, String email, String college, String interest){
	    super();
	    this.enroll_id = enroll_id;
	    this.contact = contact;
	    this.name = name;
	    this.password = password;
	    this.email = email;
	    this.college = college;
	    this.interest = interest;

	    
	   }


    /**
    * @return the s_id
    **/
	public int gets_id() {
		return s_id;
	}
	/**
	 * @param s_id the s_id to set
	*/
	public void sets_id(int s_id) {
		this.s_id = s_id;
	}
	    
	    
	    

    /**
    * @return the enroll_id
    **/
	public String getenroll_id() {
		return enroll_id;
	}
	/**
	 * @param enroll_id the enroll_id to set
	*/
	public void setenroll_id(String enroll_id) {
		this.enroll_id = enroll_id;
	}

    
	/**
    * @return the contact
    **/
	public String getcontact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	*/
	public void setcontact(String contact) {
		this.contact = contact;
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
	    * @return the email
		**/
		public String getemail() {
			return email;
		}
	/**
	    * @param email the email to set
		 */
		 public void setemail(String email) {
			this.email = email;
		}
		 
		 
   
	/**
		 * @return the college
		**/
		public String getcollege() {
			return college;
		}
	/**
		 * @param college the college to set
		*/
		public void setcollege(String college) {
				this.college = college;
		}
		
		
		
		/**
		 * @return the interest
		**/
		public String getinterest() {
			return interest;
		}
	/**
		 * @param interest the interest to set
		*/
		public void setinterest(String interest) {
				this.interest = interest;
		}
		
		
		
		
		  /**
	 * @return the club_id
	 */
	public int getClub_id() {
		return club_id;
	}

	/**
	 * @param club_id the club_id to set
	 */
	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

		@Override
		  public String toString() {
		      return "Student [s_id=" + s_id + " , enroll_id=" + enroll_id +", contact=" +contact +", name = "+ name + ", password = "+ password +", email = "+email+", college = "+college+", interest = "+ interest +" ] ";  
		  }

}










