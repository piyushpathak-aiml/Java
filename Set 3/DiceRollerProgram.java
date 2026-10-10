import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Random object
        Random random = new Random();
        
        // Variable declaration
        int numOfDice;
        int total = 0;

        // User input and variable assignment
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
            int roll = random.nextInt(1, 7);
            System.out.println("____________________");
            printDie(roll);
            System.out.println("You rolled: " + roll);
            total += roll;
        }
        System.out.println("Total: " + total);
        }
        else {
            System.out.println("Number of dice must be greater than  0");
        }

        // Display ASCII of code
        
        
        scanner.close();    
    }
    static void printDie(int roll) {
        
        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------


                """;

        String dice2 = """
                  -------
                 | ●     |
                 |       |
                 |     ● |
                  -------


                """;

        String dice3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------


                """;

        String dice4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------


                """;

        String dice5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------


                """;

        String dice6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------


                """;

        // Enhanced switches
        switch (roll) {
        case 1 -> System.out.print(dice1);
        case 2 -> System.out.print(dice2);
        case 3 -> System.out.print(dice3);
        case 4 -> System.out.print(dice4);
        case 5 -> System.out.print(dice5);
        case 6 -> System.out.print(dice6);
        default -> System.out.println("Invalid roll!");
        }

    }
}