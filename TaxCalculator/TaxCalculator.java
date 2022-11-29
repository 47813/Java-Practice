import java.util.Scanner;

public class TaxCalculator{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   //Input scanner
        
        for (int i = 0; i < 3; i++) {   //For 3 people
            System.out.print("Enter your earning: ");
            double earning = input.nextInt();   //Setting variable for entered value
            if (earning > 30.000) {
                System.out.printf("Your tax is %f USD", earning * 0.2);
            }
            
            else {
                System.out.printf("Your tax is %f USD", earning * 0.15);
            }   //Calculating and printing tax for each person
            
            System.out.println();
        }
    }
}
