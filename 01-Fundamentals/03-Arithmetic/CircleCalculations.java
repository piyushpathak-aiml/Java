import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        double radius;
        double circumference;
        double area;
        double volume;


        // User input and variable assignment
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        // Calculations
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0)  * Math.PI * Math.pow(radius, 3);
        

        // Display output
        System.out.println("The circumference of the circle: " + circumference + " cm");
        System.out.println("The area of the circle: " + area + " cm²");
        System.out.println("The volume of the circle: " + volume + " cm³");

        // To display in few digits
        System.out.println("____________________");
        System.out.printf("The circumference of the circle: %.2f cm\n", circumference);
        System.out.printf("The area of the circle: %.2f cm²\n", area);
        System.out.printf("The volume of the circle: %.2f cm³\n", volume);
        

        scanner.close();
    }
}