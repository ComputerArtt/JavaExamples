
package treesetjava;
import java.util.*;
/**
 *
 * @author ComputerArtt
 */
public class TreeSetJava {

    public static void main(String[] args) {
        
        TreeSet<String> ts = new TreeSet<String>();
        
        ts.add("USA");
        ts.add("AO");
        ts.add("BE");
        ts.add("UK");
        ts.add("RU");
        ts.add("CH");
        ts.add("TR");
        ts.add("CA");
        ts.add("CL");
        ts.add("DE");
        ts.add("FR");
        ts.add("CO");
        ts.add("PO");
        ts.add("H");
        ts.add("EC");
//         ts.add(null);  throws NullPointerException     
        System.out.println(ts);
    }
    
}
