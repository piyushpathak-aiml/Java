
public class Inheritance {
    public static void main(String[] args) {

        // inheritance = one class inherits the attributes and methods from another class
        // Child <- Parent

        // object
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // display output
        System.out.println("******************************");
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        System.out.println("******************************");

        // calling methodss
        dog.eat();
        cat.eat();
        dog.speak();
        cat.speak();
        System.out.println("******************************");
        plant.photosynthesize();


    }
}