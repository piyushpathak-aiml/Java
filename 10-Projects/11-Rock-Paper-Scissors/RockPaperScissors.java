import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // scanner and random object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // variable declaration and assignment
        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // user input and variable assignment
        do{

        System.out.println("******************************");
        System.out.println("WELCOME TO THE GAME!");
        System.out.println("******************************");
        System.out.print("Enter your move (rock, paper, scissor): ");
        playerChoice = scanner.nextLine().toLowerCase();
        System.out.println("******************************");

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
            System.out.println("Invalid choice!");
            continue;
        }

        // computer choice assignment and display
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice: " + computerChoice);

        // check win conditioning
        if(playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }
        else if (playerChoice.equals("rock") && computerChoice.equals("scissors") || playerChoice.equals("paper") && computerChoice.equals("rock")|| playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }
        
        // ask for play again
        System.out.print("Play again (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("THANK YOU FOR PLAYING!");

        scanner.close();
    }
}