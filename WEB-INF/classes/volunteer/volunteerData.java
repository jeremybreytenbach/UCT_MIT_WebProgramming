package volunteer;

public class volunteerData {
    String firstname;
	String lastname;
    String emailaddress;
    String contactnumber;
    String comments;
	String returnmessage;

    public void setFirstname( String value )
    {
        firstname = value;
    }
	
    public void setLastname( String value )
    {
        lastname = value;
    }

    public void setEmailaddress( String value )
    {
        emailaddress = value;
    }

    public void setContactnumber( String value )
    {
        contactnumber = value;
    }
	
    public void setComments( String value )
    {
        comments = value;
    }
	
    public void setReturnmessage( String value )
    {
        returnmessage = value;
    }

    public String getFirstname() { return firstname; }
	
    public String getLastname() { return lastname; }

    public String getEmailaddress() { return emailaddress; }
	
    public String getContactnumber() { return contactnumber; }

    public String getComments() { return comments; }
	
    public String getReturnmessage() { return returnmessage; }
}