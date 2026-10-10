public class Printf2 {
    public static void main(String[] args) {

        // printf() = is a method used to format output.

        // %[flags][width][.precision][specifier-character]
        
        // Variable declaration and assignment
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // Dsiplay output
        System.out.printf("%+.3f\n", price1);
        System.out.printf("%+.3f\n", price2);
        System.out.printf("% .3f\n", price3);

        System.out.println("____________________");

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, spaceis positive

        // Variable re-assignment
        price1 = 9000.99;
        price2 = 100000.15;
        price3 = -54000.01;

        // Dsiplay output
        System.out.printf("%,.3f\n", price1);
        System.out.printf("%,.3f\n", price2);
        System.out.printf("%,.3f\n", price3);

        // 0 "%0d" = zero padding
        // number "%4d" = right justified padding
        // negative number "%-4d" = left justified padding

        // Other variable declaration and assignment
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // Dsiplay output
        System.out.println("____________________");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

    }
}
