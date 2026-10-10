import java.util.Random;

public class RandomNumbers {
    public static void main (String[] args) {

        // Random object
        Random random = new Random();

        // Variable declaration
        int number1;
        int number2;
        double number3;
        boolean isHeads;

        // Variable assignment

        // Normally below is the method to assign random number.
        number1 = random.nextInt();
        isHeads = random.nextBoolean();

        // But if we need some boundaries then we write as shown below, wheree in parenthesis the first number is inclusive and second number is inclusive. So, a bound of (1, 6) the random numbers will only be between 1 and 5 and never 6.
        number2 = random.nextInt(1, 6);
        number3 = random.nextDouble(1, 101);

        // Display output 
        System.out.println("The first random number is " + number1);
        System.out.println("The second random number is " + number2);
        System.out.println("The third random number is " + number3);

        if (isHeads) {
            System.out.println("Heads");    
        }
        else {
            System.out.println("Tails"); 
        }

    }
}