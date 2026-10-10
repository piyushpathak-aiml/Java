import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        double a;
        double b;
        double c;

        // User input and variable assignment
        System.out.print("Enter the length of side A: ");
        a = scanner.nextInt();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextInt();

        // Calculation
        c = Math.sqrt(Math.pow (a, 2) + Math.pow(b, 2));

        // Display output
        System.out.println("The hypotenuse (side c) is: " + c + " cm");
        
        scanner.close();
    }
}