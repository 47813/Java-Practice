    import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   //Input scanner
        
        String number = input.next();
        
        if (number.length() != 5) {
            System.out.println("Number must be 5 digit");
            System.exit(0);
        }   //If the number is not 5 digit, exit program
        
        int p = 0;
        int q = 4;
        
        while (p < q) {
            if (number.charAt(p) != number.charAt(q)) {
                System.out.println("Not palindrome");
                System.exit(0);
            }   //Check if number is palindrome or not. If not, exit program
            
            p++;
            q--;
        }
        
        System.out.println("Palindrome");   //If palindrome, print palindrome, then finish program
        
    }
}

