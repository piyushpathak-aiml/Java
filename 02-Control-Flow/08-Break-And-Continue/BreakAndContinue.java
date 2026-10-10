public class BreakAndContinue {
    public static void main(String[] args) {
        

        // break = break out of a loop(STOP)
        // continue = skip current iteration of a loop(SKIP)

        // For loop
        for (int i = 0; i < 10; i++) {
           
           if (i ==5) {
               break;
           }
           
           System.out.print(i + " ");
        }

           System.out.printf("\n____________________\n");

           // For loop
           for (int i = 0; i < 10; i++) {
              
              if (i == 5) {
                continue;
              }
              System.out.print(i + " ");
       }
   }
}