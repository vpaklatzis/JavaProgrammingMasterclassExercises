// Coding Exercise 10: Equality Printer
/** Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".
If all numbers are equal print text "All numbers are equal"
If all numbers are different print text "All numbers are different".
Otherwise, print "Neither all are equal or different" */

public class IntEqualityPrinter {
    // write your code here
    public static void printEqual(int firstParam, int secondParam, int thirdParam) {
        if(firstParam < 0 || secondParam < 0 || thirdParam < 0) {
            System.out.println("Invalid Value");
        } else if(firstParam == secondParam && secondParam == thirdParam) {
            System.out.println("All numbers are equal");
        } else if(firstParam != secondParam && secondParam != thirdParam && firstParam != thirdParam) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}