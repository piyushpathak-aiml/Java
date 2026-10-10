import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        // Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Variable declaration
        double temperature;
        double newTemperature;
        String unit;

        // User input and variable assignment
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit> (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 9 / 5) + 32;

        // Display output
        System.out.println("____________________");
        System.out.println("Your temperature: " + temperature);
        System.out.println("Your selected unit: " + unit);
        System.out.println("Your new temperature in new unit: " + newTemperature + "°" + unit);
        System.out.println("____________________");
        
        scanner.close();
    }
}