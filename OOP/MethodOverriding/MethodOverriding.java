
public class MethodOverriding {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        // implementation  of a method that is already defined.
        // Allows for code reusability and give specific implementations.

        // object
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        
        System.out.println("******************************");

        // calling methods
        dog.move();
        cat.move();
        fish.move();

        System.out.println("******************************");

        // we can see that the dog,cat and fish is running, but fish can't run , it swims.
        // so we do method overriding in fish class


    }
}