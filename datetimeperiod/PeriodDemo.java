package datetimeperiod;

import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PeriodDemo {
    static void creationDemo() {
        // Ways to create a Period instance

        // Using the of() method to create a specific period
        Period specificPeriod = Period.of(1, 2, 3);
        System.out.println("Specific period: " + specificPeriod);

        // Using the between() method to create a period between two dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 1);
        Period periodBetween = Period.between(startDate, endDate);
        System.out.println("Period between: " + periodBetween);
    }

    static void methodsDemo() {
        Period period = Period.of(1, 2, 3);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        Period negativePeriod = Period.of(-1, -2, -3);
        System.out.println("Negative Period: " + negativePeriod);
    }

    static void plusAndMinusDemo() {
        Period period = Period.of(1, 2, 3);
        LocalDate date = LocalDate.of(2023, 1, 1);

        LocalDate newDatePlus = date.plus(period);
        System.out.println("Date after adding period: " + newDatePlus);

        LocalDate newDateMinus = date.minus(period);
        System.out.println("Date after subtracting period: " + newDateMinus);

        LocalDateTime dateTime = LocalDateTime.of(2023, 1, 1, 12, 0);
        LocalDateTime newDateTimePlus = dateTime.plus(period);
        
        System.out.println("DateTime after adding period: " + newDateTimePlus);

        Period newPeriod = Period.of(0, 0, 10).minusYears(5).plusMonths(1).minusDays(5);
        System.out.println("New Period after adding and subtracting: " + newPeriod);
    }
}
