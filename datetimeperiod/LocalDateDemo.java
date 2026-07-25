package datetimeperiod;

import java.time.LocalDate;

public class LocalDateDemo {
    static void creationDemo() {
        // Ways to create a LocalDate instance

        // Using the now() method to get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Using the of() method to create a specific date
        LocalDate specificDate = LocalDate.of(2023, 6, 15);
        System.out.println("Specific date: " + specificDate);

        // DateTimeException when trying to create an invalid date, like February 30
        // LocalDate invalidDate = LocalDate.of(2023, 2, 30);
        // System.out.println("Invalid date: " + invalidDate);

        LocalDate invalidDate2 = LocalDate.of(23123323, 12, 12);
        System.out.println("Invalid date 2: " + invalidDate2);
    }

    static void formattingDemo() {

    }

    static void methodsDemo() {

    }
}
