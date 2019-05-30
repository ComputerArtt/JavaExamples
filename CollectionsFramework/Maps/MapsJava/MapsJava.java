
package mapsjava;
import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class MapsJava {

    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<String , Integer>();
        map.put("a", Integer.MIN_VALUE);
        map.put("b", Integer.MAX_VALUE);
        map.put("c", Integer.BYTES);
        map.put("d", Integer.SIZE);
        
        System.out.println(map);
        //return set view
        Set<Map.Entry<String, Integer> > set = map.entrySet();
        for(Map.Entry<String, Integer> a:set)
        {
            System.out.println(a.getKey() + " : " +a.getValue());
            
        }
    }
    
}
