
public class Fish extends Animal {

    // method overriding
    @Override // it is a good practice to add this annotation.
    void move() {
        System.out.println("This animal is swimming");
    }

    // now the output in MethodOverriding.java will show , The fish is swimming instead of  running.
    
}