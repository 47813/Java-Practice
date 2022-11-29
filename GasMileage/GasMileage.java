import java.util.Scanner;

public class GasMileage{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   //Input Scanner
        
        System.out.print("Enter the miles driven: ");
        int miles = input.nextInt();
        
        System.out.print("Enter the gallons used: ");
        int gallons = input.nextInt();   //Collecting data for variables
        
        System.out.printf("The car uses %d gallons per mile", (miles/gallons));   //Calculate and print
    }
}
