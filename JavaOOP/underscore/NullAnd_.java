
package underscore;

/**
 *
 * @author ComputerArtt
 */
public class NullAnd_ {
    
    private static Object obj;
    public static void main(String[] args) {
        //This feature enables us to separate groups of digits in numeric 
        //and to improves readability of code.
        int i = 25_25_0_36_0;
        System.out.println(i);
        long l = 3_0000_25_00;
        System.out.println(l);
        double d = 1.25_35_00_4;
        System.out.println(d);
        
        System.out.println(obj);
        String str = null;
        System.out.println("str: "+ str);
        Integer i2 = null;
        System.out.println("i2: " + i2);
        String str2 = (String)null;
        System.out.println("str2: " + str2);
        
        Integer a = null;
        Integer b = 22;
        System.out.println(a instanceof Integer);
        System.out.println(b instanceof Integer);
        
        if(null == null)
            System.out.println("equal");
        if(null != null)
            System.out.println("not equal");
    }
    
}
