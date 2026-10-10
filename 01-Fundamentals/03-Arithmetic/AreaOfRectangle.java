import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args){

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        double width;
        double height;
        double area;

        // User input and variable assignment
        System.out.print("Enter width of the rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter height of the rectangle: ");
        height = scanner.nextDouble();

        // Calculation
        area = width * height;

        // Display output
        System.out.println("___________");
        System.out.println("The area of your rectangle is " + area + " cm²");

        scanner.close();
    }
}