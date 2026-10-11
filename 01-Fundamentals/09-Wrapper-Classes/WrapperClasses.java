
public class WrapperClasses {
    public static void main(String[] args) {    

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        // to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of collections Framework and static Utility methods.

        // treating primtive as an obect
        /* 
        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);  */

        // this is a good way to visuaize it but it is depreciated
        // the modern way to do it is by directly asssigning  the values, this technique is called autoboxing

        // autoboxing
        /*
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;   */
        // this is very similar to how we assign strings, we have always created strings this way
        // String  e = "Pizza";

        // unboxing
        /*
        int u = a;
        double x = b;
        char y = c;
        boolean z = d;  */

        // this way we are unboxing the values,  as if we are just unwrapping the wrapped classes

        // variable declaration
        String l = Integer.toString(123);
        String m = Double.toString(3.14);
        String n = Character.toString('$');
        String o = Boolean.toString(true);

        String s = l + m + n + o;

        // display output
        System.out.println(s);

        System.out.println("******************************");

        // parsing
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        // characters don't have a parseCharacter() method, so we will have to use charAt() which is unrelated to wrapper classses
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("True");

        /* String e = a + b + c +d;

        System.out.println(a);    */

        // the above commented block of code doesn't work and gives an error
        
        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}