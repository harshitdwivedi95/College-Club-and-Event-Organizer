<!DOCTYPE html>
<html>
<head>
<title> 
Event And Club
</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body
{
	background:url(hh.jpg) ;
    background-size:100%;
	background-attachment:fixed;
}
.body
{
margin-top:0;
margin-bottom:0;
margin-left:0;
margin:right:0;
width:100%;
height:100%;
}
.header img
{
	margin-top:0;
	width:100px; 
	height:100px;
	margin:0;
	float: left;
}
.header h1
{
	margin-top:0;
	color:white;
	width:100%;
	height:70px;
	font-size:40px;
	position: relative;
	top: 27px;
	text-align:center;
}
body {font-family: Arial, Helvetica, sans-serif;}
form {
	border: 3px;
	color:white;
	}
	
input {
    width: 100%;
    padding: 5px;
    margin: 20px 0 15px 0;
    display: inline-block;
    box-sizing: border-box;
	background-color:rgba(255,255,255,0.8);
	color:black;
}

button {
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    width: 100%;
}



button:hover {
    opacity: 0.8;
}
	
.container {
    padding: 20px;
    width: 40%;
	margin-left:380px;
	margin-top:50px;
	border: 2px solid rgba(255,255,255,0.6);
	background-color:#8080ff;
}

</style>
</head>
<body>
<div class="header">
<img src="LNCT.png" alt="logo">
<h1><b>LAKSHMI NARAIN COLLEGE OF TECHNOLOGY & SCIENCE</b></h1>
</div>
<div class="main">
</div>
<form id="contactform" method="post" action="/Club_system/Registrationservlet">
  <div class="container">
    <h1 style='text-align:center; margin-top:0;'>REGISTRATION</h1>
    <hr>

	<label for="enroll_id"><b>Enrollment Number</b></label>
    <input id="enroll_id" type="text" placeholder="Enter Enrollment Number" name="enroll_id" required>
	
	<label for="name"><b>Full Name</b></label>
    <input id="name" type="text" placeholder="Enter Full Name" name="name" required>

    
	<label for="email"><b>E-Mail ID</b></label>
    <input type="email" placeholder="Enter Email ID" name="email" required>
	
	<label for="contact"><b>Contact Number</b></label>
    <input id="contact" type="number" placeholder="Enter Contact Number" name="contact" required>
	
	<label for="college"><b>College Name</b></label>
	<input id="college"list="college" placeholder="Select College" name="college" required>
    <datalist> 
    <option value="Lakshmi Narain College of Technology">
    <option value="Lakshmi Narain College of Technology & Science">
    <option value="Lakshmi Narain College of Technology & Excellence">
    </datalist>
	
	<label for="interest"><b>Interests</b></label>
	<input id="interest" list="interest" placeholder="Select your Inerests" name="interest" required multiple>
    <datalist>
    <option value="Art">
    <option value="Sports">
    <option value="Craft">
	<option value="Literature">
	<option value="Technology">
	<option value="Fashion">
	<option value="Gaming">
	<option value="Debate">
	<option value="Poetry">
	<option value="Story-telling">
    </datalist>
	
	<label for="password"><b>Password</b></label>
    <input id="password" type="Password" placeholder="password" name="password" required>
	
	
    <hr>

    <button style="background-color:rgba(255,10,50);" type="submit" class="submit" name="submit">Register</button>
	<button style="background-color:rgba(10,40,255);" type="submit" class="submit" name="submit">Cancel</button>
    <p>Already have an account? <a style="color:red;"href="Login.jsp">Login</a>.</p>
</div>
</form>
</body>
</html>
