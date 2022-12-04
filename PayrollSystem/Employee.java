public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;    //Input variables for saving employee information
    
    public Employee (String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;   //Insert global variable to this class
    }
    
    public String getFirstName() {
        return firstName;   //Input get class which return fisrt name
    }
    
    public String getLastName() {
        return lastName;   //Input get class which return last name
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;   //Input get class which return social security number
    }
    
    @Override
    public String toString() {
        return String.format("%s   %s%n%s   %s%n%s   %s","first name: ", getFirstName(), "last name: ",getLastName(), "social security number: ", getSocialSecurityNumber());   //Change the print method to print as the following format
    
    }
}
