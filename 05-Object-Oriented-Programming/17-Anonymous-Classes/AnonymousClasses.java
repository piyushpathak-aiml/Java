
public class AnonymousClasses {
    public static void main(String[] args) {

        // Anonymous classes = A class that doesn't have a name. Cannot be reused.
        // Add custom behaviour without having to create a new class
        // Often used for one time uses (TimerTask, Runnable, callbacks)

        /*
        // object
        Dog dog = new Dog();
        TalkingDog ScoobyDoo = new TalkingDog();

        // method calling
        dog.speak();
        ScoobyDoo.speak();
        */

        // It is a lot of work to create a whole new class just for one unique object, our talking dog scooby doo is an exception, so rather than creating a whole new class for scooby doo, let's just create an anonymous class for scooby doo

        // we can delete the talking dog class now but we keep it for testing purpose

        // object
        Dog dog1 = new Dog();

        // Anonymous Class
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby doo says Ruh Roh");
            }
        };

        System.out.println("******************************");

        // method calling
        dog1.speak();
        dog2.speak();

        System.out.println("******************************");

    }
}