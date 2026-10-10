import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // User input and variable assignment
        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();

        /* After the user writes the input and clicks enter the "\n" character can cause an input buffer and causes a false input if there is a line scanner after this, so to solve this problem we put a line scanner after this without assigning it to any variable. */ 
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();

        System.out.println("__________");

        // Display output
        System.out.println("You are " + age + " years old");
        System.out.println("Your name is " + name);
        System.out.println("your cgpa is " + cgpa);

        scanner.close();
    }
}