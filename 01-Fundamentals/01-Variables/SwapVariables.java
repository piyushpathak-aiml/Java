public class SwapVariables {
    public static void main (String[] args){
        
        // Variable declaration and assignment
        String x = "water";
        String y = "Kool-aid";
        String temp;

        // Swapping variables
        temp = x;
        x = y;
        y = temp;

        // Display output
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}