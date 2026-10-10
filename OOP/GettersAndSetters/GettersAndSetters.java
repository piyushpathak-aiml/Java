
public class GettersAndSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITABLE.


        // object
        Car car = new Car("Charger", "Yellow", 80000);

        // if a variable is private it cannot be used outside it's class, like without getters the below output code gives error if the car classs variables are preceded with private. So we use getters for getting the values of private variables.

        // car.model = "Corvette";
        
        // display output
        // System.out.println(car.color + " " + car.model + " " + car.price);

        System.out.println("******************************");

        // method calling and output
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        /* this won't work because the variables are private so we have to use setter methods.
        car.color = "Blue";
        car.price = 5000;   */

        System.out.println("******************************");

        car.setColor("Blue");
        car.setPrice(-100);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        

        // if you don't want an attribute to be writable but just readable, you can add the keyword final after private. (see car.java)

    }
}