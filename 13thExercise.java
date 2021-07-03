// Coding Exercise 13: Number Of Days In Month
/** Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false. 
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear described above. */

public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        
        if(!(year >= 1 && year <= 9999)) {
            leapYear = false;
        } else if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leapYear = true;
        }
        
        return leapYear;
    }
    
    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
         int totalDays = 0;
         
        switch(month) {
            case 1:
                totalDays = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    totalDays = 29;
                } else {
                    totalDays = 28;
                }
                break;
            case 3: 
                totalDays = 31;
                break;
            case 4: 
                totalDays = 30;
                break;
            case 5: 
                totalDays = 31;
                break;
            case 6: 
                totalDays = 30;
                break;
            case 7: 
                totalDays = 31;
                break;
            case 8: 
                totalDays = 31;
                break;
            case 9: 
                totalDays = 30;
                break;
            case 10: 
                totalDays = 31;
                break;
            case 11: 
                totalDays = 30;
                break;
            case 12: 
                totalDays = 31;
                break;
        }
        
        return totalDays;
    }
}