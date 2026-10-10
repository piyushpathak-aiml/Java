
public class Fish implements Prey, Predator {

    // as this class implements an interface it has to define the override method 
    // as if it acts like a contract, if you implement an interrface you have to override its methods

        // variable declaration
        

        // constructors


        // methods
        @Override
        public void flee() {
            System.out.println("The fish is swimming away");
        }

        public void hunt() {
            System.out.println("The fish is hunting");
        }

}