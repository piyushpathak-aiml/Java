public class Printf1 {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output.

        // %[flags][width][.precision][specifier-character]

        // Variable declaration
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;


        // Display output
        System.out.printf("Hello %s!\n", name);
        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your are %.2f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);


        // Multiple variables in same line
        System.out.println("____________________");
        System.out.printf("%s is %d years old", name, age);
    }
}