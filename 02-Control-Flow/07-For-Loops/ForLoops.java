import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        
        // For loop = execute some code a CERTAIN amount of times

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int max;
        
        // User input and variable assignment
        System.out.print("Enter how many times you want to loop: ");
        max = scanner.nextInt();

        // For loop
        for (int i = 1; i < max; i++) {
           System.out.println(i);
        }

        // Display output
        System.out.println("HAPPY NEW YEAR!");

        System.out.println("____________________");

        // Variable declaration and assignment
        int start;
        System.out.print("How many seconds to countdown from?: ");
        start = scanner.nextInt();

        // For loop
        for (int i = start; i > 0; i--) {
           System.out.println(i);
           Thread.sleep(1000);
        }

        // Display output
        System.out.println("HAPPY NEW YEAR!");

        System.out.println("____________________");

        
        
        scanner.close();
        
    }
}