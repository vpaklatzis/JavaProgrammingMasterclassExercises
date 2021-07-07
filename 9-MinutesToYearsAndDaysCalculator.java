// Coding Exercise 9: Minutes To Years and Days Calculator
/** Write a method printYearsAndDays with parameter of type long named minutes.

The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days. */

public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int)(minutes / (365 * 60 * 24));
            int min = (int)(minutes % (365 * 60 * 24));
            int days = min / (60 * 24);
        
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}