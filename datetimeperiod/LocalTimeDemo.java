package datetimeperiod;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

    static void parsingAndFormattingDemo() {
        // The default parsing format for LocalTime is "HH:mm:ss".
        LocalTime defaultParsedTime = LocalTime.parse("12:00:00");
        System.out.println("Default formatted time: " + defaultParsedTime);

        // Custom parsing format
        LocalTime customParsedTime = LocalTime.parse("12:00", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Custom parsed time: " + customParsedTime.format(DateTimeFormatter.ofPattern("hh:mm a")));

        // With seconds and nanoseconds
        LocalTime customParsedTime2 = LocalTime.parse("12:00:12.123", DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
        System.out.println("Custom parsed time 2: " + customParsedTime2.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));

        LocalTime customParsedTime3 = LocalTime.parse("12:00:12.123456789", DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS"));
        System.out.println("Custom parsed time 3: " + customParsedTime3.format(DateTimeFormatter.ofPattern("hh:mm:ss.SSSSS")));

        LocalTime localizedFormatTime = LocalTime.of(12, 0, 12, 123456789);
        System.out.println("Formatted time: " + localizedFormatTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("Formatted time: " + localizedFormatTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }

    static void methodsDemo() {
        LocalTime parsedTime = LocalTime.parse("12:00:12.123489", DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS"));
        System.out.println("Parsed time: " + parsedTime);

        System.out.println("Hour: " + parsedTime.getHour());
        System.out.println("Minute: " + parsedTime.getMinute());
        System.out.println("Second: " + parsedTime.getSecond());
        System.out.println("Nano: " + parsedTime.getNano());
    }
}
