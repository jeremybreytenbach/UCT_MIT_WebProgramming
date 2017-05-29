<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="stylesheets/stylesheet.css"></link>
	<script type="text/javascript" src="scripts/writeMenuHTML.js"></script>
	<script type="text/javascript" src="scripts/writeFooterHTML.js"></script>
	<script type="text/javascript" src="scripts/helpers.js"></script>
	<jsp:useBean id="volunteer" class="volunteer.VolunteerData" scope="session"/> 
	
	<title>Volunteer Sign Up</title>  
	<!-- Include navigation Menu -->
	<script type="text/javascript" >writeMenuHTML();</script>
</head>

<body class="main">

<div class="whitebackblacktext">
    <h1 class="heading"><b>Volunteer sign up</b></h1>

  <!-- Main Content -->
  <div>	
	<h3><%= volunteer.getReturnmessage() %></h3> <!-- Displays message from servelet on success or invalid inputs -->
	<p>Here are the details you gave us:<br /><br />
	<b>First name:</b> <%= volunteer.getFirstname() %><br />
	<b>Last name:</b> <%= volunteer.getLastname() %><br />
	<b>Email address:</b> <%= volunteer.getEmailaddress() %><br />
	<b>Contact number:</b> <%= volunteer.getContactnumber() %><br />
	<b>Comments:</b> <%= volunteer.getComments() %><br />
	<br />
	<b>The data was saved to server location:</b> <%= volunteer.getPathhome() %><br /> <!-- This is purely here to aid the marker so that they can find the generated file on their system -->
	</p>
  </div>
</div>
  	
  <!-- Footer -->
  <script type="text/javascript" >writeFooterHTML();</script>

</body>
</html>
