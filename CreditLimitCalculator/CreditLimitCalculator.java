import java.util.Scanner;

public class CreditLimitCalculator{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   //Input scanner
        
        System.out.println("Enter balance, charges, credits in order: ");
        
        int balance = input.nextInt();
        int charges = input.nextInt();
        int credits = input.nextInt();   //Collecting data for variables
        
        System.out.print("Enter your allowed credit limit: ");
        int limit = input.nextInt();   //Collecting data for variable
        
        if (balance + charges - credits < limit) {
            System.out.println("Credit exeeded limit");
        }    //Setting (if) for credit exeeding
}
