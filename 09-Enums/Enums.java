import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficient with switches when comparing Strings.

        // scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        // object

        // here we define it this way, SUNDAY is our object
        Day day = Day.SUNDAY;

        System.out.println("******************************");
        System.out.println(day);
        System.out.println(day.getDayNumber());
        System.out.println("******************************");

        // this gets really helpful when working with switches, so we will take an example

        try {
            
            day = Day.valueOf(response);
        
            switch(day) {
                case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("IT is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }

        System.out.println("******************************");

        scanner.close();
    }
}