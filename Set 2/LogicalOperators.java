import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // !  = NOT

        // Variable declaration and assignment
        double temp = 40;
        boolean isSunny = true;

        System.out.println("____________________");
        
        // If statements
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }
        System.out.println("____________________");

        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        // Variable declaration
        String username;

        // User input and variable assignment
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 chharacters");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }
        
        scanner.close();
    }
}