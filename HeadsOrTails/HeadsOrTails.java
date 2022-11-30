import java.security.SecureRandom;

public class HeadsOrTails{
    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();   //Input randomizer
        
        int heads = 0;
        int tails = 0;   //Set variables for heads and tails
        
        for (int i = 0; i<1000; i++) {
            int num = randomNumbers.nextInt(2);
            
            if (num == 0) {
                heads += 1;
            }
            
            else {
                tails += 1;
            }
        }   //If randomly generated number is 0, then it is heads. If the randomly generated number is 1, then it is tails
        
        System.out.printf("Heads: %d", heads);
        System.out.println();
        System.out.printf("Tails: %d", tails);   //Print the final value of heads and tails
    }
}
