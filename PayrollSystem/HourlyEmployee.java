public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    
    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(String firstName, String lastName, String socialSecurityNumber);
        
        if (hours < 0.0) {
            throw new IllegalArgumentException ("Hours must be positive number");   //Giving limit for hours
        }
        
        if (wage < 0.0) {
            throw new IllegalArgumentException ("Wage must be positive number");    //Giving limit for wage
        }
        
        this.hours = hours;
        this.wage = wage;   //Setting value for given variable
    }
    
    public void setHours (double hours) {
        if (hours < 0.0) {
            throw new IllegalArgumentException ("hours must be positive number");
        }   //Giving limit for hours
        
        this.hours = hours; //Setting variable for given value
    }
    
    public double getHours() {
        return hours;
    }   //Giving value of hours
    
    public void setWage (double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException ("Wage must be positive number");
        }   //Giving limit for wage
        
        this.wage = wage;   //Setting value for given variable
    }
    
    public double getWage() {
        return wage;
    }   //Giving value of wage
    
    public double earnings() {
        if (hours > 40.0) {
            return getWage() * getHours() * 1.5;
        }   //If worked hours > 40, return given value
        
        else {
            return getWage() * getHours;
        }   //Else, return given value
    }
}
