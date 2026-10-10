public class StringMethods {
    public static void main(String[] args) {
        
        // Variable declarationand assignment
        String name = "Piyush Pathak";
        int length = name.length();

        // Below string method is to check what character exist at a particular index.
        char letter = name.charAt(0);

        // Below string method is to check what index is the given character occurs first.
        int index = name.indexOf("P");

        // Below string method is to check what index is the given character occurs last.
        int lastIndex = name.lastIndexOf("P");

        // Display output
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println("____________________");

        // To change the string to uppercase
        name = name.toUpperCase();
        System.out.println(name);

        // To change the string to lowercase
        name = name.toLowerCase();
        System.out.println(name);

        // to eliminate any whitespaces before and after the name.
        name = "    Piyush Pathak    ";
        name = name.trim();
        System.out.println(name);
        
        // To replace a character with another
        name = name.replace("P", "s");
        System.out.println(name);

        System.out.println("____________________");
        // to check empty or not (useful for if-else)
        name = "";
        if (name.isEmpty()) {
            System.out.println("Your name is empty");       
            
        } else {
            System.out.println("Hello " + name);
        }

        System.out.println("____________________");

        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name doesn't contain a space");
        }
        
        System.out.println("____________________");

        name = "password";
        if (name.equals("password")) {
            System.out.println("Your name can't be a password");
        } else {
            System.out.println("Name is eligible");
        }
        // Equal method doesn't account for case sensitivity        
    }
}