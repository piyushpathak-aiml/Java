import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        System.out.println("******************************");

        // object
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();


        // display output
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        System.out.println("******************************");

        // custom format
        LocalDateTime customDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = customDateTime.format(formatter);

        System.out.println(newDateTime);

        // custom date and time with specified date and time

        // this prints the given date
        // LocalDate customDate = LocalDate.of(2024, 12, 25);

        // this prints given date and time
        LocalDateTime customDateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime customDateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if (customDateTime1.isBefore(customDateTime2)) {
            System.out.println(customDateTime1 + " is earlier than " + customDateTime2);
        }
        else if (customDateTime1.isAfter(customDateTime2)) {
            System.out.println(customDateTime1 + " is later than " + customDateTime2);
        }
        else {
            System.out.println(customDateTime1 + " is equal to " + customDateTime2);
        }

        System.out.println("******************************");

    }
}