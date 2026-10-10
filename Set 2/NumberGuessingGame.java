import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        // Random and Scanner object
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);
        // where 11 is excluded, so inshort the random number will be from 1 to 10

        // User input and variable assignment
        System.out.println("____________________");
        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-10: ");
        System.out.println("____________________");

        // do-while loop
        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("____________________");
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts taken: " + attempts);
            }

        } while (guess != randomNumber);

        System.out.println("You have won");
        
        scanner.close();
    }
}