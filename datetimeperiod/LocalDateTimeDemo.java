package datetimeperiod;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    static void creationDemo() {
        // Ways to create a LocalDateTime instance

        // Using the now() method to get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Using the of() method to create a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 6, 15, 12, 0);
        LocalDateTime specificDateTime2 = LocalDateTime.of(2023, 6, 15, 12, 0, 12, 1231);
        System.out.println("Specific date and time: " + specificDateTime);
        System.out.println("Specific date and time 2: " + specificDateTime2);

        // DateTimeException when trying to create an invalid date and time, like February 30
        // LocalDateTime invalidDateTime = LocalDateTime.of(2023, 2, 30, 12, 0);
        // System.out.println("Invalid date and time: " + invalidDateTime);
    }
}
