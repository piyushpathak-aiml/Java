public class Arithmetic {
    public static void main(String[] args) {

        // Variable declaration and assignment
        int x = 10;
        int y = 2;
        int z;

        // Calculation

        // z = x + y; Arithmetic operator "+" for addition
        // z = x - y; Arithmetic operator "-" for subtraction
        // z = x * y; Arithmetic operator "*" for multiplication
        // z = x / y; Arithmetic operator "/" for division
        // z = x % y; Arithmetic operator "%" for modulus


        // Augmented assignment operators

        // for x = x + y;
        // we can write
        // x += y;
        // similarly
        // x -= y;
        // x *= y;
        // x /= y;

        // Calculation
        z = x * y;

        y += x;

        // Display output
        System.out.println("x times y: " + z);
        System.out.println("y plus x: " + y);

    }
}