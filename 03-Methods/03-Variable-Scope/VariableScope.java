
public class VariableScope {

    static int x = 3; // Class variable

    public static void main(String[] args) {

        // variables declared in a method are local for the method, but are unaware of same named variable in other method, this is called variable scope

        // the variable in line 4 is a calss variable , all the methods are aware of that variable's existence

        // even though there is a 3rd x variable in class scope, java likes to use any local variables first if they share the same name with any class variables
        
        // Variable declaration
        int x = 1; // Local variable

        // Display output
        System.out.println("____________________");
        System.out.println(x);

        // Calling method
        doSomething();
    }
    static void doSomething() {
        int x = 2; // Local variable

        System.out.println(x);
        System.out.println("____________________");
    }
}