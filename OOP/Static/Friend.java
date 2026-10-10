
public class Friend {

    // variable declaration
    String name;
    static int numOfFriends;

    // constructor
    Friend (String name) {
        this.name = name;
        numOfFriends++;
    }

    // method
    static void showFriends() {
        // normally if we work with an attribute we would have used "this.numOFFriends" but as we are working but static attribute , so we can just write as below
        System.out.println("You have " + numOfFriends + " friends.");
    }
}   