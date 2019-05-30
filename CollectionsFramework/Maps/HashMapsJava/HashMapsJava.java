
package hashmapsjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Computer
 */
public class HashMapsJava {

    public static void main(String[] args) {
        
        HashMap<String , Integer> hmap = new HashMap<>();
        
        hmap.put("a", Integer.MAX_VALUE);
        hmap.put("y", Integer.BYTES);
        hmap.put("z", Integer.SIZE);
        hmap.put("t", Integer.MIN_VALUE);
        
        System.out.println(hmap.size());
        System.out.println(hmap.containsKey("t"));
        System.out.println(hmap.containsValue(1));
        System.out.println(hmap.entrySet());
        System.out.println(hmap.isEmpty());
        System.out.println(hmap.get("a"));
        System.out.println(hmap.get(3));
        System.out.println(hmap.keySet());
        hmap.put("x", 777);
        System.out.println(hmap);
        //get a set of the entry
        Set set = hmap.entrySet();
        //iterator
        Iterator itr = set.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
    
}
