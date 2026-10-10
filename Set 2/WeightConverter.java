import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        double weight;
        double newWeight;
        int choice;

        // User input and variable assignment
        System.out.println("____________________");
        System.out.println("Welcome to the weight converter program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        System.out.println("____________________");

        if (choice == 1) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("New weight in kgs is: %.2f", newWeight);
        }

        if (choice == 2) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("New weight in lbs is: %.2f", newWeight);
        }
        else {
            System.out.println("Your choice is not valid");
        }
        
        

        // Display output
        System.out.println("");

        scanner.close();    
    }
}