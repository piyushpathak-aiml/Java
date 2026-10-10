
public class ArrayOfObjects {
    public static void main(String[] args) {

        // object
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        // array of objects
        Car[] cars = {car1, car2, car3};

        // for loop
        /*
        for (int i = 0; i < cars.length; i++) {
           cars[i].drive();
        }
        */

        System.out.println("******************************");

       // we can use above for loop but,
       // let's use enhanced loop for this

       for (Car car : cars) {
        car.drive();
       }

       System.out.println("******************************");

       // another way of making this array of objects 
       // declaring object inside the array of objects
       Car[] car = {new Car("Ferrari", "White"),
                    new Car("Jeep", "Black"),
                    new Car("Porsche", "Green")};

       // for loop
       for (Car carprint : car) {
        carprint.drive();
       }

       System.out.println("******************************");

    }
}