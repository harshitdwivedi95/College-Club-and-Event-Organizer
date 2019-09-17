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
<h1 style='margin-top:0;text-align:center;'>LAKSHMI NARAIN COLLEGE OF TECHNOLOGY & SCIENCE</h1>
<img style="margin:0; padding-top:0px; width:100px; height=100px;" src="LNCT.png" alt="logo">
</div>
<div class="main">
</div>
<form  id="clubform" method="post" action="/Club_system/newclub" >
  <div class="container">
    <h1 style='text-align:center; margin-top:0;'>Enter Details for a new Club</h1>
    <hr>

    <label for="name"><b>Name</b></label>
    <input id="name" type="text" placeholder="Enter Name" name="name" required>

    <label for="tag"><b>details</b></label>
    <input id="tag" type="text" placeholder="Enter details" name="tag" required>
	
	<label for="dept"><b>department</b></label>
    <input id="dept" type="text" placeholder="Enter Department" name="dept" required>
    <hr>
    <h3><a href="index.jsp">home page</a></h3>

    <button style="background-color:rgba(255,10,50);" type="submit" class="submit" name="submit">Request for new Club</button>
</div>
</form>
</body>
</html>  