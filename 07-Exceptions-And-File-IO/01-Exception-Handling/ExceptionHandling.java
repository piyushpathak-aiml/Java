import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

        // System.out.println(1 / 0);   this is an arithmetic error

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // so we handle it by

        /*
        try {
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e ) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }       */

        try {
            System.out.print("Enter a number : ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number");
        }
        catch (ArithmeticException e ) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong!");
        }
        finally  {
            scanner.close();
            System.out.println("THIS ALWAYS EXECUTES");
        }
        // when we open a file or resource, we should close it. Finally{} is more used for cleanup, closing the files and resources.

        // it is recommneded by java itself to try(resources) {} , which means try with resources so that java automatically closes the files and resources

        // like this we can try with resources

        // try (Scanner scanner = new Scanner(System.in))

    }
} 