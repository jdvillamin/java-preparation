package datetimeperiod;

import java.time.LocalTime;

public class LocalTimeDemo {
    static void creationDemo() {
        // Ways to create a LocalTime instance

        // Using the now() method to get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Using the of() method to create a specific time
        LocalTime specificTime = LocalTime.of(12, 0, 12, 1231);
        System.out.println("Specific time: " + specificTime);

        // DateTimeException when trying to create an invalid time, like 25:00
        // LocalTime invalidTime = LocalTime.of(25, 0);
        // System.out.println("Invalid time: " + invalidTime);
    }
}
