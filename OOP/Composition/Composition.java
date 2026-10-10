
public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        // For example, an engine is "part-of" a Car.
        // Allows complex objects to be constructed from smaller programs.

        // object
        Car car = new Car("Corvette", 2025, "V8");

        // methods calling


        // display output
        System.out.println(car.model);
        System.out.println(car.year);
        // System.out.println(car.engine);   this statement gives a hash ID
        System.out.println(car.engine.type);

        car.start();



    }
}