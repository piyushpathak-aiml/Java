import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value

        // Variable declaration and assignment
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        System.out.println("____________________");
        // this prints the address of array rather than it's elements
        System.out.println(fruits);

        // arrays fall under the category of reference data type
        // each value in an array is called an element
        // to access an element we have to give an index number

        // so the correct way to print  the first element is,
        System.out.println(fruits[0]);

        // if we put index that does not exist, we get an exception 

        // we can change an index of an string by
        fruits[0] = "pineapple";

        System.out.println(fruits[0]);
        System.out.println("____________________");

        fruits[0] = "apple";

        // to access the length of an array, we can,
        int numOfFruits = fruits.length;
        System.out.println("____________________");

        System.out.println(numOfFruits);

        // if we need to print all the elements of an array we can use a for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println("\n____________________");

        // we can use an enhanced for loop to print all the elements of the array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("____________________");

        // array class use to sort an array
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("____________________");

        // array class use to fill an array
        Arrays.fill(fruits, "pineapple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("____________________");
    }
}