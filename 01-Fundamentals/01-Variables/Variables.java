

// There are two types of variables.
// Primitive    vs    Reference
// int                 string
// double              array
// char                object
// boolean

public class Variables {
    public static void main (String[] args) {

        /*
        Steps to create a variable :
        1. Declaration
        2. Assignment
        */ 

       // Variable declaration and assignment
        int age = 18;
        int year = 2026;

        // Display output
        System.out.println("My age is " + age);
        System.out.println("The year is " + year);

        System.out.println("__________");

        // Variable declaration and assignment
        double price = 19.99;
        double cgpa = 9.5;

        // Display output
        System.out.println("The price of a bottle is INR" + price);
        System.out.println("My CGPA is " + cgpa);

        System.out.println("__________");

        // Variable declaration and assignment
        char grade = 'A';
        char symbol = '&';
        char currency = '$';

        // Display output
        System.out.println("My grade is " + grade);
        System.out.println("This is a symbol:  " + symbol);
        System.out.println("This is a currency: " + currency);
        System.out.println("__________");

        // Variable declaration and assignment
        boolean isStudent = true;
        boolean forSale = false;

        // Display output
        if (isStudent){
            System.out.println("You are a Student");
        }
        else {
            System.out.println("You are not a Student");
        }

        System.out.println("For sale = " + (forSale));
         System.out.println("__________");

        // Variable declaration and assignment
        String name = "Piyush Pathak";
        String email = "piyushpathak123@gmail.com";

        // Display output
        System.out.println("My name is " + name);
        System.out.println("My email is " + email);

    }
}