import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Scanner;



public class MusicPlayer {
    public static void main(String[] args) {

        // How to play audio with Java (.av, .au, .aiff)

        // variable declaration
        // we can use the absolute filepath but the relative path is simpler
        String filepath = "BreakingBad.wav";
        File file = new File(filepath);

        // try with resources
        try(Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            // clip object
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // variable declaration
            String response = "";

            System.out.println("******************************");

            // while loop
            while(!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                // enhanced switch
                switch(response) {
                case "P" -> clip.start();
                case "S" -> clip.stop();
                case "R" -> clip.setMicrosecondPosition(0);
                case "Q" -> clip.close();
                default -> System.out.println("Invalid choice");
            }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch(LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch(UnsupportedAudioFileException e ) {
            System.out.println("Audio file is not supported");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("******************************");
            System.out.println("BYE!");
            System.out.println("******************************");
        }


    }
}