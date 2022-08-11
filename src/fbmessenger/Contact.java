package fbmessenger;

import java.util.Date;
public class Contact {
    //user details
    public String username;
    public String firstName;
    public String lastName;
    public String email;
    public Date dateOfBirth;

    Contact(String username,String firstName,String lastName,String email,Date dateOfBirth){
        this.username=username;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
    }

}
