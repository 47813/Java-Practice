public class CommissionEmployee extends Employee {  //This file extends from Employee file
    private double grossSales;
    private double commissionRate;  //Set private variables
    
    public CommissionRate (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);   //Get these variables from extended file
        
        if (grossSales < 0.0) {
            throw new IllegalArgumentException ("Gross sales must be >= 0.0");
        }   //Giving limits for grossSales value
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException ("Commission rate must be > 0.0 and < 1.0");
        }   //Giving limits for commissionRate value
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;   //Completing value changes
    
    }
    
    public void setGrossSales (double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException ("Gross sales must be > 0.0");
        }   //Setting limits for grossSales value
        
        this.grossSales = grossSales;   //Completing value change
    }
    
    public double getGrossSales() {
        return grossSales;  //Returning grossSales value
    }
    
    public void setCommissionRate (double commissionRate) {
        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException ("Commission rate must be > 0.0 or < 1.0");  //Setting limits for commissionRate value
        }
        
        this.commissionRate = commissionRate;   //Completing value change
    }
    
    public double getCommissionRate() {
        return commissionRate;  //Returning grossSales value
    }
    
    public double earnings() {
        return getCommissionRate() * getGrossSales();   //Returning calculated earning value
    }
    
    @Override
    public String toString() {
        return String.format("%s%n%s   %s",super().toString(), "gross sales: ", getGrossSales(), "commission rate: ", getCommissionRate());
    }   //Changing CommissionEmployee class printed value to following format
}
