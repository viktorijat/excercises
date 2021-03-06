package demo2;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Times {

    public static void main(String[] args) {

        //question9();
        //question20();
        question42();
        //question146();
    }

    private static void question146() {

        LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);

        // 2016-02-14
    }

    private static void question42() {
        LocalDate date = LocalDate.of(2012, 01, 32);
        date.plusDays(10);
        System.out.println(date);

        // Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
    }

    private static void question20() {
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);

        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
    }

    private static void question9() {

        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));

        long hrs = ChronoUnit.HOURS.between(depart, arrive);
        System.out.println("hours travel " + hrs);

        //4
    }
}
