public abstract class Employee extends Date {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;   //Setting private variables
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
    this.birthDate = birthDate; //Getting the value from main class to this class
}

public String getFirstName() {
    return firstName();
}   //Giving firstName value

public String getLastName() {
    return lastName();
}   //Giving lastName value

public String getSocialSecurityNumber() {
    return socialSecurityNumber();
}   //Giving socialSecurityNumber value

public Date getBirthDate() {
    return birthDate();
}   //Giving birthDate value

@Override
public String toString() {
    return String.format("%s   %s%nSocial security number:   %s%nBirth date: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
}   //Setting print value to given form

public abstract double earnings();  //Make an abstract class for earnings
