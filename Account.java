public class Account {
    private String name;
    private double balance;    //instance variable
    
    public Account(String name, double balance) {
        this.name = name;
        
        if (balance > 0.0) {
            this.balance = balance; 
        }
    }    //Setting nalue of name and balance
    
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("withdrawal amount exeeded balance");
            }
        }    //calculating withdrawal amount
    
    public double getBalance() {
        return balance;
    }    //returning value of balance
}
