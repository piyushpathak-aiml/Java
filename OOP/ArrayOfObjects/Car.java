
public class Car {
    
    // variable declaration
    String model;
    String color;

    // constructor
    Car (String model, String color) {
        this.model = model;
        this.color = color;
    }

    // methods
    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}   