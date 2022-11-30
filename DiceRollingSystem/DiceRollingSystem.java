import java.security.SecureRandom;

public class DiceRollingSystem{
    public static void main(String[] args) {
        
        SecureRandom random = new SecureRandom();   //Input randomizer
        
        int sum[] = new int[36000001];  //Make a array to save all values
        
        for (int i = 1; i <= 36000000; i++) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            sum[i] = dice1 + dice2; //Get two random dice and save the added value
    }
    
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;    //Make a variable for each value
    
    for (int j = 1; j < 36000000; j++) {
        switch(sum[j]) {
            case 2:
                count2 += 1;
            case 3:
                count3 += 1;
            case 4:
                count4 += 1;
            case 5:
                count5 += 1;
            case 6:
                count6 += 1;
            case 7:
                count7 += 1;
            case 8:
                count8 += 1;
            case 9:
                count9 += 1;
            case 10:
                count10 += 1;
            case 11:
                count11 += 1;
            case 12:
                count12 += 1;
        }
    }   //Input value for each variable
    
        
    System.out.printf("case 2: %d, case 3: %d, case 4: %d", count2, count3, count4);
    System.out.println();
    System.out.printf("case 5: %d, case 6: %d, case 7: %d", count5, count6, count7);
    System.out.println();
    System.out.printf("case 8: %d, case 9: %d, case 10: %d", count8, count9, count10);
    System.out.println();
    System.out.printf("case 11: %d, case 12: %d", count11, count12);
    }   //Print result
}
