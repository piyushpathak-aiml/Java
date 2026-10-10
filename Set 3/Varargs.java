
public class Varargs {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ... (ellipsis)

        // variable declaration and assignment
        int result = add (1, 2, 3, 4);
        double result2 = average(2, 4, 7, 8);

        System.out.println("____________________");

        // display output
        System.out.println("Your result (sum) is: " + result);

        System.out.println("____________________");

        System.out.println("Your result2 (average) is: " + result2);

        System.out.println("____________________");
        
    }
    static int add(int... numbers){
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
    static double average(double... numbers2) {

        double sum = 0;

        if (numbers2.length == 0) {
            return 0;
        }

        for (double number : numbers2) {
            sum += number;
        }

        return sum / numbers2.length;
    }
}