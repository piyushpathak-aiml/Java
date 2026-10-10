import java.util.Scanner;

public class Madlibs {
    public static void main (String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // User input and variable assignment
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        // Display output
        System.out.println("___________");
        
        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + ".");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }
}