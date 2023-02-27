package org.example.entity;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String department;
//    private static String companyName;
    private String password;
    private String emailAddress;

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param department
     * @param emailAddress
     * @param password
     */
    public User(String id, String firstName,String lastName,String department,String emailAddress,String password){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName  = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
