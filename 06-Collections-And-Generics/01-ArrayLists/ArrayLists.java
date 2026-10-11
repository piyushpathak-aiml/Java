import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayLists {
    public static void main(String[] args) {

        // Array list = A responsible array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayList can change

        // array list declaration
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("******************************");

        // to add to the list
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        System.out.println("******************************");

        // array list declaration of strings
        ArrayList<String> fruits = new ArrayList<>();

        // adding to the array list
        fruits.add("Apple");
        fruits.add("Coconut");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits);

        // removing an element from the array list
        fruits.remove(1);

        // setting an element of the list to something
        fruits.set(0, "Pineapple");

        System.out.println(fruits);

        System.out.println("******************************");

        // we can also get elements from the array list
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(2));

        // we can get size of the array list by
        System.out.println(fruits.size());

        System.out.println("******************************");

        // we can also sort the array list using,
        Collections.sort(fruits);

        System.out.println(fruits);

        System.out.println("******************************");

        // enhanced for loop to iterate through all the elements of the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("******************************");

        // scanner object
        Scanner scanner = new Scanner(System.in);

        // array list declaration
        ArrayList<String> foods = new ArrayList<>();

        // user input and variable assignment

        System.out.print("Enter the number of foods you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter the food #" + numOfFood + " : ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
        
        
        scanner.close();
    }
}