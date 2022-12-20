import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class datefunctioning{

    public static void main(String[] args) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        String date = "2016-12-17";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);


        LocalDate from = LocalDate.now();
        LocalDate to = from.plusDays(10);
        from = from.plusDays(3); 

        long result = ChronoUnit.DAYS.between(from, to);
        System.out.println(result);

        
  
    }
}