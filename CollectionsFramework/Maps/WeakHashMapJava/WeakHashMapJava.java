
package weakhashmapjava;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 *
 * @author ComputerArtt
 */
public class WeakHashMapJava {

    public static void main(String[] args) {
        
        HashMap hashMap= new HashMap();
		
        WeakHashMap weakHashMap = new WeakHashMap();
        
        String keyhm = new String("1");
        String keywhm = new String("2");
        
        hashMap.put(keyhm, "java");
        weakHashMap.put(keywhm, "c++");
        System.gc();
        System.out.println(hashMap.get("1")+" "+weakHashMap.get("2"));
        System.out.println(hashMap);
        System.out.println(weakHashMap);
        
        keyhm = null;
        keywhm = null;
        
        System.gc();  
        
        System.out.println(hashMap.get("1")+" "+weakHashMap.get("2"));
        System.out.println(hashMap);
        System.out.println(weakHashMap);
    }
    
}
