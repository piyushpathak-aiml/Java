import java.util.Scanner;
public class UserInputIntoArray {
    public static void main(String[] args) {
        
        // scanner object
        Scanner scanner = new Scanner(System.in);
        
        // variable declaration
        String[] foods;
        int size;

        System.out.println("____________________");

        // User input and variable assignment
        System.out.print("Enter the number of food you want: ");
        size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("____________________");

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the name of a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("____________________");

        // display output
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}