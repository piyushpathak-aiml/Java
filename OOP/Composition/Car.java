
public class Car {

        // variable declaration
        String model;int year;
        Engine engine;

        // constructors
        Car(String model, int year, String engineType) {
            this.model = model;
            this.year = year;
            this.engine = new Engine(engineType);
        }

        // methods
        void start() {
            this.engine.start();
            System.out.println("The " + this.model + " is running.");
        }


}