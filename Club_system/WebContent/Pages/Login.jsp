<html>
<head>
<title> 
Event And Club
</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="/Club_system/resources/Style.css"
	media="all" />



</head>
<body>
<div class="divtop">
<h1 style='margin-top:0;text-align:center;'></h1>
<h1 style='margin-top:0;text-align:center;'>LAKSHMI NARAIN COLLEGE OF TECHNOLOGY & SCIENCE</h1>
<img style="margin:0; padding-top:0px; width:200px; height=200px;" src="LNCT.png" alt='logo'>
</div>
<div class="main">
</div>
<form method="POST" action="/Club_system/Loginservlet">
  <div class="container">
    <h1 style='text-align:center; margin-top:0;'>LOGIN</h1>
    <hr>

    <label for="Enroll"><b>Enrollment</b></label>
    <input id="Enroll" type="text" placeholder="Enter Enrollment Number" name="Enroll" required>

    <label for="psw"><b>Password</b></label>
    <input id="psw" type="password" placeholder="Enter Password" name="psw" required>
	
    <hr>

    <button style="background-color:rgba(255,10,50);" type="submit" class="submit" name="submit">Login</button>
	<button style="background-color:rgba(10,40,255);" type="submit" class="submit" name="submit">Know More</button>
    <p>Don't have an account? <a style="color:red;"href="Registration.jsp">Register</a>.</p>
</div>
</form>
</body>
</html> 