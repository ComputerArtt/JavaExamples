
package linkedhashmapjava;

import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class LinkedHashMapJava {

    public static void main(String[] args) {
        
        LinkedHashMap<String, String> lhm = 
                new LinkedHashMap<String, String>();
        
        lhm.put("1", "www.google.com");
        lhm.put("2", "www.amazon.com");
        lhm.put("3", "www.apple.com");
        lhm.put("4", "www.microsoft.com");
        
        System.out.println(lhm);
        System.out.println(lhm.get("1"));
        System.out.println(lhm.size());
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.containsKey("4"));
        System.out.println(lhm.remove("3"));
        System.out.println(lhm);
    }
    
}
