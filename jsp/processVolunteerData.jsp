<jsp:useBean id="volunteer" class="volunteer.VolunteerData" scope="session"/>
<jsp:setProperty name="volunteer" property="*"/> 
<%
// This scriptlet validates inputs and then appends submitted form data to a CSV file called volunteers.txt and returns a message of thanks for signing up

// Receive form data

String firstname = request.getParameter( "firstname" );
String lastname = request.getParameter( "lastname" );
String emailaddress = request.getParameter( "emailaddress" );
String contactnumber = request.getParameter( "contactnumber" );
String comments = request.getParameter( "comments" );
String returnMessage = request.getParameter("returnmessage");
//String isvalid = request.getParameter("isvalid");

volunteer.runValidation();

volunteer.writeVolunteerDataToCSV();

response.sendRedirect("submitSuccess.jsp");

%>