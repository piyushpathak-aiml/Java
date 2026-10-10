import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        String name = "";

        // While loop
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        
        // Display output
        System.out.println("Hello " + name);

        System.out.println("____________________");

        // Variable declaration
        String response = "";

        // While loop
        while (!response.equals("Q")) {
            System.out.println("You are playing a game.");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        // Display output
        System.out.println("You have quit the game");

        System.out.println("____________________");

        /*
        // Variable declaration
        int age = 0;

        // User input and variable assignment
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // While loop
        while (age < 0) {
        System.out.println("Your age can't be negative");
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        }

        // Display output
        System.out.println("You are " + age + " years old");
        */

       // This code can be better otpimized as below using do-while

        // Variable declaration
        int age = 0;

        // do-while loop
        do{
        System.out.println("Your age can't be negative");
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        } while (age < 0);

        // Display output
        System.out.println("You are " + age + " years old");

        System.out.println("____________________");

        // Variable declaration
        int number = 0;

        // while loop
        while (number < 1 || number > 10) {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }

        // Display output
        System.out.println("You picked " + number);

        scanner.close();
    }
}