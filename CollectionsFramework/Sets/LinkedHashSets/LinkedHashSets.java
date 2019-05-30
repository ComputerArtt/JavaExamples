
package linkedhashsets;

import java.util.*;

/**
 *
 * @author ComputerArtt
 */
public class LinkedHashSets {

    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("USA");hs.add("AO");hs.add("BE");
        hs.add("UK");hs.add("RU");hs.add("CH");
        hs.add("TR");hs.add("CA");hs.add("CL");
        hs.add("DE");hs.add("FR");hs.add("CO");
        hs.add("PO");hs.add("H");hs.add("EC");
        hs.add("EC");///duplicate values cannot be stored
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains("BE"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.hashCode());
        
        
    }
    
}
