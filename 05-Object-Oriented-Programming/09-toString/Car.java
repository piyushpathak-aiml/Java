
public class Car {

        // variable declaration
        String make;
        String model;
        int year;
        String color;

        // constructors
        Car(String make, String model, int year, String color) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        // overriding methods
        @Override
        public String toString() {
            return  this.color + " " + this.year + " " + this.make + " " + this.model;
        }

}   