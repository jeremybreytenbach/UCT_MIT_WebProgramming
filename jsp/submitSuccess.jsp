<jsp:useBean id="volunteer" class="volunteer.VolunteerData" scope="session"/> 
<HTML>
<BODY>
You entered<BR>
Your data was successfully caputred: <%= volunteer.getInputsvalid() %><BR>
Message: <%= volunteer.getReturnmessage() %><BR>
First name: <%= volunteer.getFirstname() %><BR>
Last name: <%= volunteer.getLastname() %><BR>
Email address: <%= volunteer.getEmailaddress() %><BR>
Contact number: <%= volunteer.getContactnumber() %><BR>
Comments: <%= volunteer.getComments() %><BR>
</BODY>
</HTML>