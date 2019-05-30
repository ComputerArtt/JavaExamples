
package treemapjava;

import java.util.TreeMap;

/**
 *
 * @author ComputerArtt
 */
public class TreeMapJava {

    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();
        
        tm.put("alex", 656.425);
        tm.put("Alex", 111.222);
        tm.put("beyonce", 111.22);
        tm.put("ali", 457.63);
        tm.put("bayan", 55.4);
        
        System.out.println(tm);
        
        double db = ((Double)tm.get("ali")).doubleValue();
        tm.put("ali", db+1000);
        System.out.println("ali's new value: " + tm.get("ali"));
    }
    
}
