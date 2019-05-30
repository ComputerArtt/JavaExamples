package hashsets;

import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class HashSets {

    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");hs.add("AO");hs.add("BE");
        hs.add("UK");hs.add("RU");hs.add("CH");
        hs.add("TR");hs.add("CA");hs.add("CL");
        hs.add("DE");hs.add("FR");hs.add("CO");
        hs.add("PO");hs.add("H");hs.add("EC");
        //duplicate values cannot be stored
//        hs.add("USA");
//        hs.add("USA");
//        hs.add("USA");
//        hs.add("USA");
        System.out.println(hs);
        System.out.println(hs.contains("TR"));
        System.out.println(hs.contains("tr"));
        
        Iterator itr = hs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        hs.removeAll(hs);
        System.out.println(hs);
    }
    
}
