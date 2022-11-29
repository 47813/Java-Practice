import java.util.Scanner;

public class FindTheLargestNumber{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   //Input scanner
        
        int largest = 0;
        
        for (int counter = 1; counter < 11; counter++) {   //For 10 times
            System.out.print("Enter an integer: ");
            int number = input.nextInt();   //Collect number from scanner
            
            if (counter == 1) {
                largest = number;   //If the number is the first inputted number, then the inputted number is the largest number
            }
            
            else {
                if (largest > number) {
                    continue;   //If the inputted number is smaller than the largest number, continue
                }
                
                else{
                    largest = number;   //If the inputted numbeer is larger than the largest number, then change the largest number to the inputted number
                }
            }
        }
        
        System.out.printf("The largest number is: %d", largest);   //Print the largest number
    }
}
