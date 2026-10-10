import java.util.Scanner;

public class ShoppingCart {
    public static void main (String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        // User input and variable assignment
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // Calculation
        total = price * quantity;

        // Display output

        System.out.println("________________");
        System.out.println("\nYou have bought " + quantity + " " + item + "/s " );
        System.out.println("Your total is $" + total);

        scanner.close();
    }
}