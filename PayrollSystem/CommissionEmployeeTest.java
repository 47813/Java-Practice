public class CommissionEmployeeTest {
    public static void main(String[] args) {
        
        CommissionEmployee employee = new CommissionEmployee ("Sue", "Jones", "222-22-2222", 10000, 0.06);  //Giving values for each variable
        
        System.out.println(employee);   //Printing result in setted format
        
        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);    //Changing values for employee
        
        System.out.println(employee);   //Printing result in setted format
    }
}
