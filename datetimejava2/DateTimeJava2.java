
package datetimejava2;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ComputerArtt
 */
public class DateTimeJava2 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf.format(date));
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("S yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf2.format(date));
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("D yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf3.format(date));
        
        SimpleDateFormat sdf4 = new SimpleDateFormat("F yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf4.format(date));
        
        SimpleDateFormat sdf5 = new SimpleDateFormat("w yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf5.format(date));
        
        SimpleDateFormat sdf6 = new SimpleDateFormat("G yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("current date: " + sdf6.format(date));
        
        //Parsing String into Date
        SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "2019-05-17" : args[0];
        System.out.print(input + "------> ");
        Date t;
        try {
            t = sdf7.parse(input);
            System.out.println(t);
        } catch (Exception e) {
        }
        
        //Sleeping for a while using sleep()
        try {
            System.out.println(new Date());
            Thread.sleep(10*60*10);
            System.out.println(new Date());
        } catch (Exception e) {
        }
        
        //Measuring millisecond
        
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(10*60*10);
            long end = System.currentTimeMillis();
            System.out.println(new Date());
            long difference = end - start;
            System.out.println("diff: " + difference);
        } catch (InterruptedException ex) {
            Logger.getLogger(DateTimeJava2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
