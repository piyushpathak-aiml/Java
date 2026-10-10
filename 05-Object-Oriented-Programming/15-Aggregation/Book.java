
public class Book {

        // variable declaration
        String title;
        int pages;

        // constructors
        Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        // methods
        String displayInfo() {
            return this.title + " (" + this.pages + ") pages";       
        }

}