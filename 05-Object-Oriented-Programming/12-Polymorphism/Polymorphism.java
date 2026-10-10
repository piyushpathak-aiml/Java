
public class Polymorphism {
    public static void main(String[] args) {

        // Polymorphism = "POLY" means many
        // "MORPH" means shape
        // objects can identify as other objects.
        // objects can be treated as objects of a common superclass.

        // object
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // methods calling
        car.go();
        bike.go();
        boat.go();

        // Array of objects
        // Car[] car = {car, bike, boat};
        // Bike[] car = {car, bike, boat};
        // Boat[] car = {car, bike, boat};

        // all of these are invalid , because car and bike don't identify as boats and vice versa

        Vehicle[] vehicles = {car, bike, boat};

        // method calling
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}