import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;



public class ReadFiles {
    public static void main(String[] args) {

        // How to read a file using  Java (using 3 popular options)
        // BufferedReader + FileReader : Best for reading text files line-by-line.
        // FileInputStream : Best for binary files (e.g., imagess, audio, files).
        // RandomAccessFile : Best for read/write specific portions of a large file.

        // variable declaration
        String filepath = "D:\\Piyush\\Programming\\Java\\07-Exceptions-And-File-IO\\03-Read-Files\\Test.txt";

        System.out.println("******************************");

        // try iwth resources
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath));){

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch(IOException e) {
            System.out.println("Something went wrong");
        }

        System.out.println("******************************");

    }
}