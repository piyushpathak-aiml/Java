import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        // scanner object
        Scanner scanner = new Scanner(System.in);
        
        // variable declaration
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 7;
        boolean isFound = false;

        System.out.println("____________________");

        // linear search
        for (int i = 0; i < numbers.length; i++) {
           if (target == numbers[i]) {
               System.out.println("Element found at index: " + i);
               isFound = true;
               break;
           }
        }

        if (!isFound) {
                System.out.println("Element not found in the array");
            }
            
        System.out.println("____________________");

        // but what if we have an array of strings?
        String[] fruits = {"apple", "orange", "banana"};

        System.out.print("Enter a fruit to search for in the array: ");
        String targetFruit = scanner.nextLine();

        // as Strings are reference data types , when comparing through i in the loop, we would end up comparing adddress of two elements, hence we use the equals() method

        // linear search
        for (int i = 0; i < fruits.length; i++) {
           if (fruits[i].equals(targetFruit) ) {
               System.out.println("Element found at index: " + i);
               isFound = true;
               break;
           }
        }

        if (!isFound) {
                System.out.println("Element not found in the array");
            }
            
        System.out.println("____________________");

        

        scanner.close();
    }
}