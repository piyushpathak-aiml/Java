
public class Person {

    // variable declaration
    String first;
    String last;

    // constructor
    Person (String first, String last) {
        this.first = first;
        this.last = last;
    }

    // method
    void showName() {
        System.out.println(this.first + " " + this.last);
    }
    
}