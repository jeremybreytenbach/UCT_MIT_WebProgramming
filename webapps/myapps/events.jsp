<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="./stylesheets/stylesheet.css"></link>
	<script type="text/javascript" src="./scripts/writeMenuHTML.js"></script>
	<script type="text/javascript" src="./scripts/writeFooterHTML.js"></script>
	<script type="text/javascript" src="./scripts/helpers.js"></script>
	<jsp:useBean id="events" class="events.EventData" scope="session"/> 
	
	<title>Events</title>  
	<!-- Include navigation Menu -->
	<script type="text/javascript" >writeMenuHTML();</script>
</head>

<body class="main">

<div class="whitebackblacktext">
    <h1 class="heading"><b>Events</b></h1>
    <p>How you can get involved</p>

  <!-- Main Content -->
  <div> 
    <h2 class="heading">Host a Stationery Drive on World Stationery Day!</h2>
    <p>
	Basic stationery is a necessity for learning in the classroom and at home. </p>
	<p>As an ongoing initiative, our
foundation has supplied over 20,000 basic stationery packs to needy learners over the past 4 years.
As part of our fifth anniversary, we aim to collect 7,000 basic stationery packs for distribution to
fifteen rural schools. You can help by hosting a stationery drive at your school, church or office on
26 th April 2017.
</p>
<p>
Contact participation@afforableeducation.org for more information for resources to host your own
stationery drive.</p>
  </div>
  
  <div> 
    <h2 class="heading">Books for Learning</h2>
    <p>
	The Foundation for Affordable Education has partnered with Books for Learning for the past two
	years to raise funds for books and learning aids in the classroom. Sell or buy 2nd hand affordable
	textbooks online at www.booksforlearning.org and the organization will donate 10% of the profit to
	our foundation.</p>
  </div>
  
  <!-- JSP Event data read -->
  <div>
  <h2 class="heading">Upcoming events</h2>
	<table id="eventstable">
  <tr>
    <th>Name</th>
    <th>Date</th> 
    <th>Time</th>	
    <th>Venue</th>
    <th>Description</th>
  </tr>
  <%= events.csvToHtmlTable() %>
</table>
<br />
  </div>
  
</div>
  
  <!-- Footer -->
  <script type="text/javascript" >writeFooterHTML();</script>

</body>
</html>
