
public class Methods1 {
    public static void main(String[] args) {
        
        // method = A block of reusable code that is executed when called()
        /* 

        If we need to execute the below code multipple times it will become full of unnecessary code. We can use method for this.

        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday dear you");
        System.out.println("You are x years old");
        System.out.println("Happy birthday to you");

        */

        // One thing to note is that methods are unaware of variables declared in other methods

        // Variable declaration
        String name = "Jack";
        int age = 18;

        // Calling the method
        // The information we send with a method are called arguments
        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

    }
    
    // What we receive in a method is called parameter
    // It can be named differently but the order and data type should be correct

    static void happyBirthday(String name, int years) {
        System.out.println("____________________");
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old\n", years);
        System.out.println("Happy birthday to you");
    }
}