
public class ToStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaningful details.

        // object
        Car car1 = new Car("Ford", "Mustang", 2025, "red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "blue");


        // display output
        System.out.println("******************************");
        // System.out.println(car1);   This normally prints a hash code and not the result we want
        // So we use this System.out.println(car1.color + " " + car1.year + " "  + car1.make + " "  + car1.model);
        // but this can be printed by the toString() method and this System.out.println(car1); statement. 
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("******************************");

    }
}