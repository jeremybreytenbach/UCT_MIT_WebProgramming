<jsp:useBean id="volunteer" class="volunteer.volunteerData" scope="session"/> 
<HTML>
<BODY>
You entered<BR>
First name: <%= volunteer.getFirstname() %><BR>
Last name: <%= volunteer.getLastname() %><BR>
Email address: <%= volunteer.getEmailaddress() %><BR>
Contact number: <%= volunteer.getContactnumber() %><BR>
Comments: <%= volunteer.getComments() %><BR>
Message: <%= volunteer.getReturnmessage() %><BR>
</BODY>
</HTML>