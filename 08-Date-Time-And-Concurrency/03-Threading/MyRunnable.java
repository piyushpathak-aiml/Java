
public class MyRunnable implements Runnable{

        // variable declaration
        

        // constructors


        // methods
        @Override
        public void run() {

            int i;

                for(i = 1; i <= 5; i++) {

                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {
                    System.out.println("Thread was interrupted");
                }
                if(i == 5) {
                    System.out.println("\nTime's up!");

                    // if we don't use the below line the main program will show time's up but will still wait for input and will not exit, so we explicitly give an exit code
                    System.exit(0);
                }
            }

            System.out.println("******************************");
        }

}