
public class Product<T, U> {

        // variable declaration
        T item;
        U price;

        // constructors
        Product(T item, U price) {
            this.item =  item;
            this.price = price;
        }

        // methods
        public T getItem() {
            return this.item;
        }

        public U getPrice() {
            return this.price;
        }

}