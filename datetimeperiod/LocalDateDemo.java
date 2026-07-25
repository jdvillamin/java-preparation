package datetimeperiod;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateDemo {
    static void creationDemo() {
        // Ways to create a LocalDate instance

        // Using the now() method to get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Using the of() method to create a specific date
        LocalDate specificDate = LocalDate.of(2023, 6, 15);
        System.out.println("Specific date: " + specificDate);

        // Using Month
        LocalDate specificDate2 = LocalDate.of(2023, Month.JUNE, 15);
        System.out.println("Specific date 2: " + specificDate2);

        System.out.println("Month: " + specificDate.getMonthValue());
        System.out.println("Month: " + specificDate.getMonth());

        // DateTimeException when trying to create an invalid date, like February 30
        // LocalDate invalidDate = LocalDate.of(2023, 2, 30);
        // System.out.println("Invalid date: " + invalidDate);

        LocalDate invalidDate2 = LocalDate.of(23123323, 12, 12);
        System.out.println("Invalid date 2: " + invalidDate2);

        // Constructors of Localdate are private, so you cannot create an instance using the new keyword
        // LocalDate invalidDate3 = new LocalDateDemo(2025, 2, 30);

        // Using the parse() method to create a LocalDate from a string
        LocalDate parsedDate = LocalDate.parse("2023-06-15");
        LocalDate customParsedDate = LocalDate.parse("2023-333", DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println("Parsed date: " + parsedDate);
        System.out.println("Custom parsed date: " + customParsedDate);
    }

    static void parsingAndFormattingDemo() {
        // The default parsing format for LocalDate is "yyyy-MM-dd".
        LocalDate defaultParsedDate = LocalDate.parse("2023-06-15");
        LocalDate isoParsedDate = LocalDate.parse("2023-06-15", DateTimeFormatter.ISO_DATE);
        LocalDate isoParsedDate2 = LocalDate.parse("2023-06-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Default formatted date: " + defaultParsedDate);
        System.out.println("Custom formatted date: " + isoParsedDate);
        System.out.println("Custom formatted date 2: " + isoParsedDate2);

        // Custom parsing format
        LocalDate customParsedDate = LocalDate.parse("15/06/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Custom parsed date: " + customParsedDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        LocalDate customParsedDate2 = LocalDate.parse("1999-06-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Custom parsed date 2: " + customParsedDate2.format(DateTimeFormatter.ofPattern("yy-MM-dd")));

        // LocalizedDate 
        LocalDate date = LocalDate.of(2024, 7, 1);

        System.out.println("Date: " + date);

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(new Locale("en", "PH"));
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println("Short format: " + date.format(shortFormat));
        System.out.println("Medium format: " + date.format(mediumFormat));
        System.out.println("Long format: " + date.format(longFormat));
        System.out.println("Full format: " + date.format(fullFormat));
    }

    static void methodsDemo() {
        LocalDate parsedDate = LocalDate.parse("2023-06-15");
        System.out.println("Parsed date: " + parsedDate);

        System.out.println("getDayOfWeek(): " + parsedDate.getDayOfWeek());
        System.out.println("getDayOfMonth(): " + parsedDate.getDayOfMonth());
        System.out.println("getDayOfYear(): " + parsedDate.getDayOfYear());

        System.out.println("getMonthValue(): " + parsedDate.getMonthValue());
        System.out.println("getMonth(): " + parsedDate.getMonth());

        System.out.println("getYear(): " + parsedDate.getYear());
    }

    static void plusAndMinusDemo() {
        LocalDate parsedDate = LocalDate.parse("2024-02-25");
        LocalDate parsedDate2 = LocalDate.parse("2023-02-25");
        System.out.println("Parsed date: " + parsedDate);

        LocalDate plusDays = parsedDate.plusDays(10);
        LocalDate plusDays2 = parsedDate2.plusDays(10);
        System.out.println("Plus 10 days: " + plusDays);
        System.out.println("Plus 10 days 2: " + plusDays2);

        LocalDate minusDays = parsedDate.minusDays(10);
        System.out.println("Minus 10 days: " + minusDays);

        LocalDate plusMonths = parsedDate.plusMonths(2);
        System.out.println("Plus 2 months: " + plusMonths);

        LocalDate minusMonths = parsedDate.minusMonths(2);
        System.out.println("Minus 2 months: " + minusMonths);

        LocalDate plusYears = parsedDate.plusYears(1);
        System.out.println("Plus 1 year: " + plusYears);

        LocalDate minusYears = parsedDate.minusYears(1);
        System.out.println("Minus 1 year: " + minusYears);

        // Chaining
        LocalDate chainedDate = parsedDate.plusDays(10).minusMonths(1).plusYears(2);
        System.out.println("Chained date: " + chainedDate);

        // Immutability
        LocalDate originalDate = LocalDate.parse("2024-02-25");
        LocalDate modifiedDate = originalDate.plusDays(10);
        originalDate.plusMonths(1); // This does not modify the original date
        System.out.println("Original date: " + originalDate);
        System.out.println("Modified date: " + modifiedDate);
    }
}
