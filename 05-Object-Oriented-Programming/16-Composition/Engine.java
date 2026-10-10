
public class Engine {

        // variable declaration
        String type;

        // constructors
        Engine(String type) {
            this.type = type;
        }


        // methods
        void start() {
            System.out.println("You start the " + this.type + " engine");
        }


}