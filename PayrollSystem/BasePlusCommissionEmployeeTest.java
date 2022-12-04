public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        
        BasePlusEmployee employee = new BasePlusEmployee ("Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);  //Input givin value to BasePlusEmployee file
        
        System.out.println(employee);   //Check the value
        employee.setBaseSalary(1000);   //Changing baseSalary variable to givin value
        System.out.prinln(employee);    //Check the value
    }
}
