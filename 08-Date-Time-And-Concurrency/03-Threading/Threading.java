import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        // Helps improve performance with time-consuming operations
        // (File I/O, network communications, or any background tasks)

        // How to create a Thread
        // Option 1. Expand the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        // our program currently runs on main thread

        // scanner object
        Scanner scanner = new Scanner(System.in);

        MyRunnable MyRunnable = new MyRunnable();
        Thread thread = new Thread(MyRunnable);
        
        // right now the thread will keep going even if we enter the name, because even if main thread finishes , the other threads continue, so we declare them as daemon thread
        thread.setDaemon(true);
        thread.start();

        /*
        System.out.println("******************************");

        System.out.println("You have 5 seconds to enter your name");  */

        // the below block of commented code doesn't work as expected in the same thread so we put it in a different thread.

        /*
        for(i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            if(i == 5) {
                System.out.println("Time's up!");
            }
        }
        */

       System.out.println("******************************");

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("******************************");

        scanner.close();

    }
}