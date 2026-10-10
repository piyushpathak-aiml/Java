
public class Static {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        // rather than to any specific object
        // commonly used for utility methods or shared resources

        // object
        Friend friend1 = new Friend("Jack");
        Friend friend2 = new Friend("Michael");
        Friend friend3 = new Friend("Patrick");

        // display output
        
        // it is suggested to use Class name itself rather than object name, it's better for clarity to use a static by the name of the class itself instead of any object, because we will have an idea later that it's a static variable
        System.out.println("******************************");
        Friend.showFriends();
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println("******************************");

    }
}