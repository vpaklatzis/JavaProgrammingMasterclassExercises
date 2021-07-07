// Coding Exercise 14: Sum Odd
/** Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.
If number is odd return true, otherwise  return false.

Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input. */

public class SumOddRange {
    public static boolean isOdd(int number) {
        boolean oddNumber = false;
        if(number <= 0) {
            return oddNumber;
        } else if(number == 1 || number % 2 == 1) {
            oddNumber = true;
        } 
        
        return oddNumber;
    }
    
    public static int sumOdd(int start, int end) {
        int sum = -1;
        if(!(start > 0 && end > 0 && end >= start)) {
            return sum;
        }
        
        sum += 1;
        
        for(; start <= end; start++) {
            if(isOdd(start)) {
                sum += start;
            }
        }
        
        return sum;
    }
}