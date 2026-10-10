

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator ? = Return 1 of 2 values if a condition is true

        // Variable = (condition) ? ifTrue : ifFalse;

        // Variable declaration and assignment
        int score = 70;
        int number = 3;
        int hours = 13;
        int income = 60000;

        // Ternary operator statement
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        // Display output
        System.out.println("____________________");
        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(timeOfDay);
        System.out.println(taxRate);
        System.out.println("____________________");

    }
}