// Coding Exercise 5: DecimalComparator
/** Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false. */

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        boolean areEqual = false;
        int firstInt = (int)(firstNumber*1000);
        int secondInt = (int)(secondNumber*1000);
        
        if(firstInt == secondInt) {
            areEqual = true;
        }
        
        return areEqual;
    }
}