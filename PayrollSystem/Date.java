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
        
        System.out.printf("Date object contructor for date %s%n", this);    //Print outcome
    }
    
    public void nextDay() { //A class which makes the date calculate as the next day
        day += 1;
        if (day > daysPerMonth [month]) {
            day = 1;
            month += 1;
        }   //If day exeeds the maximum day of the month, then go to next month, and reset date as 1
        
        if (month > 12) {
            month = 1;
            year += 1;
        }   //If month exeeds December, then go to next year, then reset to January
    }
}
