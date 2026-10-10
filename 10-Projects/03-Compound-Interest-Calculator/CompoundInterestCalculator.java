import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        

        // Variable declaration
        double principle;
        double rate;
        int timescompounded;
        int years;
        double amount;

        // User input and variable assignment
        System.out.print("Enter the principle amount : ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timescompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Calculation
        amount = principle * Math.pow(1 + rate/ timescompounded, timescompounded * years);
        
        // Display output
        System.out.println("____________________");
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        
        scanner.close();    
    }
}