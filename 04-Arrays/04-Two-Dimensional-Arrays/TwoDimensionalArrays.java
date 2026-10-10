
public class Arrays2D {
    public static void main(String[] args) {
        
        // 2D array = an array where each element is an array
        // useful for storing a matrix of data

        // variable declaration and assignment
        /*
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] drinks = {"water", "tea", "coffee", "cola"};
        */
        // we can also write the above code differently as shown in line 16

        String[][] groceries = {{"apple", "orange", "banana"},
                               {"potato", "onion", "carrot"},
                               {"water", "tea", "coffee", "cola"}};

        System.out.println("____________________");

        // display output
        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println("____________________");

        // we can also change the values by doing,
        groceries[0][1] = "mango";
        groceries[1][2] = "celery";
        groceries[2][1] = "milkshake";

         // display output
        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println("____________________");

        // lets make a telephonepad
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

         // display output
        for(char[] row : telephone) {
            for(char number : row) {
                System.out.print(number + "    ");
            }
            System.out.println();
        }

        System.out.println("____________________");
    }
}