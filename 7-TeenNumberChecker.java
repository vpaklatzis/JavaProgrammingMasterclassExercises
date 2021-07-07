// Coding Exercise 7: Teen Number Checker
/** We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false. */

public class TeenNumberChecker {
    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam) {
        boolean teen = true;
        
        if((firstParam >= 13 && firstParam <= 19) || (secondParam >= 13 && secondParam <= 19) || (thirdParam >= 13 && thirdParam <= 19)) {
            return teen;
        }
        
        teen = false;
        return teen;
    }
    
    public static boolean isTeen(int param) {
        boolean teen = true;
        
        if(param >= 13 && param <= 19) {
            return teen;
        }
        
        teen = false;
        return teen;
    }
}