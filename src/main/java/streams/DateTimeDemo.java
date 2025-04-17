package streams;

import javax.swing.text.DateFormatter;
import java.sql.Time;
import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Set;
import java.util.Timer;

public class DateTimeDemo {
    public static void main(String[] args) {
        //LocalDate API
/*
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();
        int dayOfYear = now.getDayOfYear();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        Month month = now.getMonth();
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);
        System.out.println(month.getValue());

        LocalDate customDate = LocalDate.of(1990, 05, 04);
        System.out.println(customDate);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println(yesterday);
*/
        //LocalTime
       /* LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getHour());
        LocalTime beforeTwoHours = nowTime.minusHours(2);
        if(nowTime.isAfter(beforeTwoHours))
            System.out.println("No it is wrong!");

        LocalTime customTime = LocalTime.of(15, 45, 34);
        System.out.println(customTime);
        LocalTime parsedTime = LocalTime.parse("18:23:34");
        System.out.println(parsedTime);*/

        //LocalDateTime
        /*LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        LocalDateTime customDateTime = LocalDateTime.of(2023, 05, 04, 12, 00, 00);
        System.out.println(customDateTime);*/

        //ZonedDateTime
       /* ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);*/

        //Instant
        /*System.out.println(System.currentTimeMillis());
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        Instant instant2 = Instant.now();
        System.out.println(instant2);

        Duration duration = Duration.between(instant, instant2);
        System.out.println(duration);
        Duration zeroDuration = Duration.ZERO;
        System.out.println(zeroDuration);*/

        //Period
        LocalDate today = LocalDate.now();
        LocalDate backDate = LocalDate.of(2021, 04, 06);
//        System.out.println(Period.between(today, backDate));

        //DateTimeFormatter
        String date = "26/04/1999";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);

        String dateTimeString = "2023-04-09 11:45:56-05:00";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, dateTimeFormatter1);
        System.out.println(zonedDateTime);


    }
}
