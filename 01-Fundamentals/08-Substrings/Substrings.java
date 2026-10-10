import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        
        // .substring() = A method used to ectract a protion of a string
        //                .substring(start, end)

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration and assignment
        String email = "admin123@gmail.com";
        String username = email.substring(0, 8);
        String domain = email.substring(8, 18);
        // we can also write
        // String domain = email.substring(8);


        // Display output
        System.out.println(username);
        System.out.println(domain);

        System.out.println("____________________");

        // we can also
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        System.out.println(username);
        System.out.println(domain);

        System.out.println("____________________");

        // User input and variable assignment
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        // Display output
        if (email.contains("@")) {
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        System.out.println(username);
        System.out.println(domain);
        }
        else {
            System.out.println("Emails must contain @");
        }
        

        scanner.close();
    }
}