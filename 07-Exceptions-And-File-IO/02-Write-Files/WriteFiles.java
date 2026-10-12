import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WriteFiles {
    public static void main(String[] args) {

        // how to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Before performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        // trying with resources
        // try (FileWriter writer = new FileWriter("test.txt")) {
        //     writer.write("I like pizza");
        //     System.out.println("File has been written");
        // }
        // catch (IOException e) {
        //     System.out.println("Coulld not write file");
        // }

        // this was the way to do so, now let's do the same thing with a fileppath specific file and file not found exception

        // in a better way, let's just make a string of filepath
        String filePath = "D:\\Piyush\\Programming\\Java\\07-Exceptions-And-File-IO\\02-Write-Files\\test.txt";

        // below we write a multi-line string using triple sets of double quotes
        String textContent = """
            Think with purpose, let logic lead,
            Build with patience, plant the seed.
            Let every failure make you wise,
            And turn each challenge to a rise.
                             """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch (IOException e) {
            System.out.println("Coulld not write file");
        }
    
    }
}