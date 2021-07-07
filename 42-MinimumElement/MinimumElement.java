import java.util.Scanner;

public class MinimumElement {
    // write code here
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int number = scanner.nextInt();
        
        return number;
    }
    
    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }
    
    private static int findMin(int[] array) {
        int min = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}