import java.util.Scanner;

public class BankingProgram {

    // Scanner object
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Variable declaration
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // Display menu
        while (isRunning) {
        System.out.println("____________________");
        System.out.println("BANKING PROGRAM");
        System.out.println("____________________");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("____________________");


        // Get user input and process user's choice
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        // Enhanced switches
        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
    }

    System.out.println("____________________");
    System.out.println("Thank you, have a nice day!");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("____________________");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit() {
        double amount;
        // we can either create a local scope scanner or a class scope scanner to use in different methods

        System.out.print("Enter an amount to deposit: ");
        amount = scanner.nextDouble();

        System.out.println("____________________");
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }

    }
    static double withdraw(double balance) {
        
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        System.out.println("____________________");
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else { 
            return amount;
        }
        
    }
    
}