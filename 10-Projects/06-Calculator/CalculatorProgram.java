import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        // User input and variable assignment
        System.out.println("____________________");
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an arithmetic operator (+, *, /, -, ^): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("____________________");

        // Switch case statements
        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result  = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        // Display output
        if (validOperation) {
            System.out.println("Your result is: " + result);
        }
        
        scanner.close();
    }
}