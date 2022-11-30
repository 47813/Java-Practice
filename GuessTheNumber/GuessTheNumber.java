import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();   //Input randomizer
        int number = randomNumbers.nextInt(1000) + 1;   //Setting number between 1 and 1000
        
        Scanner input = new Scanner(System.in); //Input scanner
        
        int counter = 1;
        while (true) {
            System.out.print("Guess a number :");
            int guess = input.nextInt();    //Insert number
            counter += 1;   //Increase counter by each guess
            
            if (guess == number) {
                if (counter < 10) {
                    System.out.println("Either you got lucky or you know the secret!");
                    break;  //If counter is lower than 10, print
                }
                
                if (counter == 10) {
                    System.out.println("You know the secret");
                    break;  //If counter is 10, print
                }
            }
            
            if (counter > 10) {
                System.out.println("You should be able to do better");
                break;  //If counter is more than 10, finish the program
            }
        }
    }
}
