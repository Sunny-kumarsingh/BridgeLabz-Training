import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {

    public static void main(String[] args) {

        // Formatter for readable output
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss z");

        // GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time : " + gmtTime.format(formatter));

        // IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time : " + istTime.format(formatter));

        // PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time : " + pstTime.format(formatter));
    }
}
