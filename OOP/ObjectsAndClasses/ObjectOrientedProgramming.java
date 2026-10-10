
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        /*
        Object = An entity thath holds data (attributes) and can perform actions (methods). It is a refernce data type.
        */

        // car object (Like scanner and random object)
        Car car = new Car();

        // Display output
        System.out.println("******************************");
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println("******************************");

        // calling methods defined in Car class
        car.stop();
        car.drive();
        car.brake();
        car.stop();
        System.out.println("******************************");
       
    }
}