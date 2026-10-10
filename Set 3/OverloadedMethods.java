
public class OverloadedMethods {
    public static void main(String[] args) {
        
        // overloaded method = methods that share the same name, but different parameters 
        // signature = name + parameters

        // Variable declaration and assignment
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");

        // Display output
        System.out.println("____________________");
        System.out.println(add(1, 2, 3));
        System.out.println("____________________");
        System.out.println("Your pizza is: " + pizza);
    }

    // two methods can have the same name when they have different parameters

    // no two methods can have the same signature 
    static double add(double a, double b) {
        return a +b;
    }
    static double add(double a, double b, double c) {
        return a +b + c;
    }
    static String bakePizza (String bread) {
        return bread + " pizza";
    }
    static String bakePizza (String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza (String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}