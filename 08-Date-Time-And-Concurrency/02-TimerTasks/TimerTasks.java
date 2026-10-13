import java.util.Timer;
import java.util.TimerTask;

public class TimerTasks {
    public static void main(String[] args) {

        // Timer = Class that schedules tasks at specific times or periodically
        // Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        // you will extend the TimerTask class to define your task
        // Create a subclass of TimerTask and @Override run()

        // object
        Timer timer = new Timer();
        TimerTask  task = new TimerTask() {

            int count = 10;

            @Override 
            public void run() {
                System.out.println("Hello!");
                count--;
                if(count < 0) {
                    System.out.println("******************************");

                    System.out.println("Task completed!");

                    System.out.println("******************************");
                    
                    timer.cancel();
                }
            }
        };

        // methods calling
        timer.schedule(task, 1000, 1000);


        // display output


    }
}