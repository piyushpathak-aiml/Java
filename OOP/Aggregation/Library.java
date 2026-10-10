
public class Library {

        // variable declaration
        String name;
        int year;
        Book[] books;

        // constructors
        Library (String name, int year, Book[] books) {
            this.name = name;
            this.year = year;
            this.books = books;
        }


        // methods
        void displayInfo() {
            System.out.println("The " + this.year + " " + this.name);

            for (Book book : books) {
                System.out.println(book.displayInfo());
            }
        }

}