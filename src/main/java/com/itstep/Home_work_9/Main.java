package Home_work_9;

import java.sql.Date;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.MILLIS;

public class Main {
    public static void main(String[] args) throws ParseException {
        LocalDate lastDayofCurrentMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the current month: "+
                lastDayofCurrentMonth.getDayOfWeek() + "," + lastDayofCurrentMonth);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
//        String string1 = "20 03 2020";
//        String string2 = "17 05 2020";
//
//        LocalDate date1 = LocalDate.parse(string1, dtf);
//        LocalDate date2 = LocalDate.parse(string2, dtf);
//        long daysBetween = Duration.between(date1, date2).toDays();
//        System.out.println("Days: " + daysBetween);

        LocalTime t1 = LocalTime.parse("11:20:00.000");
        LocalTime t2 = LocalTime.parse("11:26:00.500");
        System.out.println("The seconds between times "+ Math.round(MILLIS.between(t1, t2) / 1000.0));

        LocalDate now = LocalDate.now();
        TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
        System.out.println(now.with(fieldISO, 1));

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/L/dd h a:mm:ss");
        String text = date.format(formatter);
        LocalDateTime parsedDate = LocalDateTime.parse(text, formatter);
        System.out.println(parsedDate);


    }
}