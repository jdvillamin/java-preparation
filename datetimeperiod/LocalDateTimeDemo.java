package datetimeperiod;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;

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

        // Combining LocalDate and LocalTime to create a LocalDateTime
        LocalDateTime combinedDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("Combined date and time: " + combinedDateTime);
    }

    static void parsingAndFormattingDemo() {
        // The default parsing format for LocalDateTime is "yyyy-MM-dd'T'HH:mm:ss".
        LocalDateTime defaultParsedDateTime = LocalDateTime.parse("2023-06-15T12:00:00");
        LocalDateTime isoParsedDateTime = LocalDateTime.parse("2023-06-15T12:00:00", DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime isoParsedDateTime2 = LocalDateTime.parse("2023-06-15T12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        System.out.println("Default formatted date and time: " + defaultParsedDateTime);
        System.out.println("Custom formatted date and time: " + isoParsedDateTime);
        System.out.println("Custom formatted date and time 2: " + isoParsedDateTime2);

        // Custom parsing format
        LocalDateTime customParsedDateTime = LocalDateTime.parse("15/06/2023 12:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Custom parsed date and time: " + customParsedDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")));

        // With ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2023-06-15T12:00:00+02:00[Europe/Paris]", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX'['VV']'"));
        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("ZonedDateTime 2: " + zonedDateTime2);

        // Formatting with Time Zones
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedZonedDateTime = zonedDateTime.format(formatter);
        System.out.println("Formatted ZonedDateTime: " + formattedZonedDateTime);

        // Using Localized Format
        LocalDateTime localizedDateTime = LocalDateTime.now();
        System.out.println("Localized date and time (SHORT): " + localizedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("Localized date and time (MEDIUM): " + localizedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        ZonedDateTime zonedDateTime3 = ZonedDateTime.now();
        System.out.println("ZonedDateTime (SHORT): " + zonedDateTime3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("ZonedDateTime (MEDIUM): " + zonedDateTime3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("ZonedDateTime (LONG): " + zonedDateTime3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
        System.out.println("ZonedDateTime (FULL): " + zonedDateTime3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
    }
}
