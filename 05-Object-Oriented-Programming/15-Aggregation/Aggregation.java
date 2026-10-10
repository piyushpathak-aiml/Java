
public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        // One object contains another object as part of its structure,
        // but the contained object/s can exist simultaneously.

        // object
        Book book1 = new Book("The atomic habits", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the king", 416);

        // Array of objects
        Book[] books = {book1, book2, book3};

        System.out.println("******************************");

        // Library object
        Library library = new Library("NYS Public Library", 1897, books);

        // methods calling
        library.displayInfo();

        System.out.println("******************************");

        // display output


    }
}