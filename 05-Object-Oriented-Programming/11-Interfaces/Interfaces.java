
public class Interfaces {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        // that implementing classes not MUST define.
        // supports multiple inherritance-like behaviour.

        // object
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        System.out.println("******************************");

        // methods calling
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

        System.out.println("******************************");

        // display output


    }
}