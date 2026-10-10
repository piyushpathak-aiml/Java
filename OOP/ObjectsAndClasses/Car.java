
public class Car {

        // fields/variables eclared in class but outside methods are called instance field/variable.
    
        // variable declaration and assignment
        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        double price = 60000.99;
        boolean isRunning = false;

        // methods
        void start() {
            System.out.println("You started the engine!");
        }
        void stop() {
            System.out.println("You stopped the engine!");
        }
        void drive() {
            System.out.println("You drive the " + model);
        }
        void brake() {
            System.out.println("You brake the " + model);
        }

}