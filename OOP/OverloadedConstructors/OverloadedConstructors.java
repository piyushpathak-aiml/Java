
public class OverloadedConstructors {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        // with different parameter lists.
        // enable objects to be initialized in various ways.

        // objects
        User user1 = new User("Jack");
        User user2 = new User("Michael", "Michael12@gmail.com");
        User user3 = new User("Patrick", "Patrickhere@gmail.com", 25);
        User user4 = new User();

        // display output
        System.out.println("******************************");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println("******************************");

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println("******************************");

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println("******************************");

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println("******************************");

    }
}