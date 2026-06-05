package JuneMonthFirst;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate lst = LocalDate.now();
        LocalTime lst2 = LocalTime.now();
DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.YYYY");
String val = lst.format(dt);
System.out.println(val);
        System.out.println(lst2);
        System.out.println(lst);
    }
}
