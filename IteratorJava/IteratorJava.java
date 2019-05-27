
package enumeration;
import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class IteratorJava {

    public static void main(String[] args) {
        
       Vector days = new Vector();
       days.add("montag");
       days.add("dientag");
       days.add("mittwoch");
       days.add("donerstag");
       days.add("freitag");
       days.add("samstag");
       days.add("sonntag");
       
       System.out.println(days);
       //enumeration
        Enumeration e = days.elements();
        while(e.hasMoreElements())
            System.out.print(e.nextElement()+" , ");
        
        System.out.println();
        //iterator
        Iterator itr = days.iterator();
        while(itr.hasNext())
        {
            if(itr.next().equals("mittwoch"))
                itr.remove();           
        }
        System.out.println(days);
        //listiterator
        ListIterator ltr = days.listIterator();
        while(ltr.hasNext())
        {
            System.out.println(ltr.next());
            System.out.println(ltr.nextIndex());
            System.out.println(ltr.hasPrevious());
            System.out.println(ltr.previousIndex());    
        }
        System.out.println(days);
    }
    
}
