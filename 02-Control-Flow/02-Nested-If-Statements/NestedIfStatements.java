public class NestedIfStatements {
    public static void main(String[] args) {
        
        // Variable declaration
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        // Nested if else statements
        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%.");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%.");
            price *= 0.9;
            }
            
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
            
        }

        // Display output
        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}   