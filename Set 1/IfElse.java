import java.util.Scanner;

public class IfElse {
    public static void main (String[] args) {

        // If statement = Performs a block of code when the given condition is true. 
        // else if = If we have multiple if statements, then we use else if for the other if statements.
        // else = If no if or else if statement is true, then the default block of code that executes is else.

        // Scanner object
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        // User input and variable assignment
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.println("______________");
        
        // Group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }

        // Group 2
        if (age >= 65) {
            System.out.println("You are a senior!");
        }
        else if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if (age < 0) {
            System.out.println("You are an adult!");
        }
        else if (age == 0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }

        // Group 3

        if (isStudent) {
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
}