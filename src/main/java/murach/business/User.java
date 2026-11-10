package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    // add: dateOfBirth, searchMethod, receiveAnn, contactMethod
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String searchMethod;
    private String receiveAnn;
    private String contactMethod;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        searchMethod = "";
        receiveAnn = "";
        contactMethod = "";
    }

    public User(String firstName, String lastName, String email, String dateOfBirth,
                String searchMethod, String receiveAnn, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.searchMethod = searchMethod;
        this.receiveAnn = receiveAnn;
        this.contactMethod = contactMethod;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getsearchMethod() {
        return searchMethod;
    }

    public void setsearchMethod(String searchMethod) {
        this.searchMethod = searchMethod;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    public void setdateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getreceiveAnn() {
        return receiveAnn;
    }

    public void setreceiveAnn(String receiveAnn) {
        this.receiveAnn = receiveAnn;
    }

    public String getcontactMethod() {
        return contactMethod;
    }

    public void setcontactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
