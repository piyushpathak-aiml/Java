
public class Methods2 {
    public static void main(String[] args) {
        
        // method = a block of reusable code that is executed when called()

        // Variable declaration and assignment
        double result = square(3);
        String fullName = getFullName("Michael", "Jackson");
        int age = 22;

        //Display output
        System.out.println("____________________");
        System.out.println("The square of your number is: " + result);
        System.out.println("The cube of your number is : " + cube(3));
        System.out.println("Your full namee is: " + fullName);
        System.out.println("____________________");

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }

        System.out.println("____________________");

        // Display output
    }

    // here we remove the void because we are actually returning a value, and we will put double instead as we are going to return a double

    static double square(double n) {
        return n * n;
    }
    static double cube (double n) {
        return n * n * n;
    }
    static String getFullName (String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck (int age) {

        // in professional way we can just write
        // return age >= 18;
        // below is the if-else version
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}