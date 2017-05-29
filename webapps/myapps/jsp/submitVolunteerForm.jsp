<%
// This scriptlet appends submitted form data to a CSV file called volunteers.txt and returns a message of thanks for signing up

// Receive form data
String fname = request.getParameter( "fname" );
String lname = request.getParameter( "lname" );
String email = request.getParameter( "email" );
String contact = request.getParameter( "contact" );
String commentsid = request.getParameter( "commentsid" );

// Validate data

// Append to text file

// If successful, return success message. Else return error message.
%>


