package basic;

import java.time.LocalDate;
import java.time.Period;

public class DateTest {

    public static void main(String[] args) {
        int dt = 19900101;
        LocalDate localDate = LocalDate.of(1990, 01, 01);
        LocalDate localDate1 = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        int i = localDate1.getYear() - localDate.getYear();
        System.out.println(i);

        Period period = Period.between(localDate, localDate1);
        System.out.println(period.getYears());
    }
}
