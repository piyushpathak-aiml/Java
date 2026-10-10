import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        
        // nested loop = A loop inside another loop
        //               Used often with matrices or DSA

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("____________________");
        // Nested for loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("____________________");

        // Variable declaration
        int rows;
        int columns;
        char symbol;

        // User input and variable asssignment
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        System.out.println("____________________");

        // For loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        System.out.println("____________________");

        scanner.close();
    }
}