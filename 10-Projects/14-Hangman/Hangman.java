import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Hangman {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        // Arraylist of words
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }

        // scanner and random object
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // variable declaration
        String word = words.get(random.nextInt(words.size()));

        // array list
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        // for loop
        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("******************************");
        System.out.println("WELCOME TO JAVA HANGMAN GAME");
        System.out.println("******************************");

        // while loop
        while(wrongGuesses < 6) {

            System.out.print(getHangmanArt(wrongGuesses));

        System.out.println("Word: ");

        // enhanced for loop
        for(char c : wordState) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess = scanner.next().toLowerCase().charAt(0);

        // if-else statements
        if(word.indexOf(guess) >= 0) {
            System.out.println("Correct guess!");

            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == guess) {
                    wordState.set(i, guess);
                }
            }

            if(!wordState.contains('_')) {
                System.out.print(getHangmanArt(wrongGuesses));
                System.out.println("YOU WIN!");
                System.out.println("The word was: " + word);
                break;
            }
        }
        else {
            wrongGuesses++;
            System.out.println("Wrong  guess!");
        }
    }

    // if statement
    if(wrongGuesses >= 6) {
        System.out.print(getHangmanArt(wrongGuesses));
        System.out.println("GAME OVER!");
        System.out.println("The word was: " + word);
    }

        scanner.close();
    }

    // method
    static String getHangmanArt(int wrongGuesses) {

        return switch(wrongGuesses){

            case 0 -> """



                      """;

            case 1 -> """
                       O

                    
                      """;

            case 2 -> """
                       O
                       |
                    
                      """;

            case 3 -> """
                       O
                      /|
                    
                      """;

            case 4 -> """
                       O
                      /|\\
                    
                      """;

            case 5 -> """
                       O
                      /|\\
                      / 
                      """;

            case 6 -> """
                       O
                      /|\\
                      / \\
                      """;

            default -> "";

        };
    }
}