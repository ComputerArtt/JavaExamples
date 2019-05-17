
package datetimejava;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
/**
 *
 * @author ComputerArtt
 */
public class DateTimeJava {

    public static void main(String[] args) {
        //Instant class
        Instant ins = Instant.now();
        System.out.println("Instant: " + ins);
        
        Clock c1 = Clock.systemUTC();
        Instant ins2 = Instant.now(c1);
        System.out.println("Instant: " + ins2);
        
        //Date class
        Date date = new Date();
        System.out.println("Date: " + date.toString());
        SimpleDateFormat sdate = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdate.format(date));
        
        String sob = String.format("current date/time: %tc ", date);
        System.out.println(sob);
        
        //Year Class
        Year yea = Year.of(2019);
        System.out.println("year: " + yea);
        System.out.println(yea.minus(Period.ofYears(100)));
    }
    
}
