public BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalry); {
        super(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate);    //Get values from CommissionEmployee
        
        if (baseSalry < 0.0) {
            throw new IllegalArgumentException ("Base salary must be >= 0.0");
        }   //Giving limit for baseSalary
        
        this.baseSalry = baseSalary;    //Setting the variable as the givin value
    }
    
    public double getBaseSalary() {
        return baseSalary;  //Returning baseSalary
    }
    
    public void setBaseSalary() {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException ("Base salary must be >= 0.0");
        }       //Giving limit for baseSalary
        
        this.baseSalary = baseSalary;   //Setting the variable as the givin value
    }
    
    @Override
    public double earnings() {
        return getBaseSalary + super.earnings();
    }   //Changings the value of earnings from CommissionEmployee
    
    @Override
    public String toString() {
        return String.format("%s%n%s   %s", super.toString(), "base salary: ", getBaseSalary());
    }   //Changings the printing format from CommissionEmployee
    
}
