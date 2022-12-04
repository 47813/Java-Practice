public class Date{
    private int month;
    private int day;
    private int year;   //Set variable for each value
    
    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};  //Set maximum day for each month
    
    public Date (int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1 ~ 12");
        }   //If month exeeds december, throw illegal argument exception
        
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
            throw new IllegalArgumentException ("day (" + day + ") out of range");
        }   //If day exeeds the maximum day of month, throw illegal argument exception
        
        this.month = month;
        this.day = day;
        this.year = year;   //Set value as each variable
        
    }
    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
