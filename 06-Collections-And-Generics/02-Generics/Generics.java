
public class generics {
    public static void main(String[] args) {

        // Generics = A content where you can write a class, interface, or method
        // that is compatible with different data types.
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies the type)

        // object
        // when we use a wrapper class we only specify  a particularr data type and cannot store values of other data types , which is called type argument.
        
        // object
        Box<String> box = new Box<>();

        box.setItem("Banana");

        // display output
        System.out.println("******************************");
        System.out.println(box.getItem());

        // object
        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);


        // Output display
        System.out.println("******************************");

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println("******************************");

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

        System.out.println("******************************");

        /* In short, generics allow a class to work with different data types by specifying the data type inside the `<>` brackets when creating an object.

        Two objects of the same class can have different data types in this way. */

    }
}