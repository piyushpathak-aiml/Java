import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        
        // Enhanced switch = A replacement for many if else statements

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        String day;

        // User input and variable assignment
        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();


        // Switch statements
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println("It is not a day");
        }

        scanner.close();
    }
}