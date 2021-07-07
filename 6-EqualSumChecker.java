// Coding Exercise 6: Equal Sum Checker
/** Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false. */

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam) {
        boolean equalSum = true;
        
        if((firstParam + secondParam) == thirdParam) {
            return equalSum;
        } else {
            equalSum = false;
            return equalSum;
        }
    }
}