package basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo {
    public static void main(String[] args) {
        String dt = "19900504";
        String date = "1990/09/12";
        String date2 = "15/05/2025";
        String anotherDate = "December 15, 2023";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        LocalDate localDate1 = LocalDate.parse(dt, formatter1);
        System.out.println("Parsed Local Date1 : "+localDate1);

        LocalDate localDate2 = LocalDate.parse(date, formatter2);
        System.out.println("Parsed Local Date2 : "+localDate2);

        LocalDate localDate3 = LocalDate.parse(date2, formatter3);
        System.out.println("Parsed Local Date3 : "+localDate3);

        LocalDate localDate4 = LocalDate.parse(anotherDate, formatter4);
        System.out.println("Parsed Local Date4 : "+localDate4);
    }
}
