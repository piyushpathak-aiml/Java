import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class CountdownTimer {
    public static void main(String[] args) {

        // JAVA COUNTDOWN TIMER PROGRAM

        // scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        // object
        Timer timer = new Timer();

        // anonoymous class
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                
                System.out.println(count);
                count--;

                if(count < 0) {
                    System.out.println("HAPPY NEW YEAR!");

                    // if we forget timer.cancel(); the program will keep running forver for every value <= 0, so it is important to write it
                    timer.cancel();
                }
            }
        };

        // methods calling
        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, perriod)

        // display output

        
        scanner.close();
    }
}